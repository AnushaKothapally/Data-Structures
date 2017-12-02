package learnjava;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srishailamdasari1
 */
public class Findroute {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int ncity, mroutes;
        ncity=s.nextInt();
        mroutes=s.nextInt();
        int adjMat[][]= new int[ncity][ncity];
        int arr[][]=new int[mroutes][3];
        
        for(int i=0;i<mroutes;i++){
        for(int j=0;j<3;j++){
            arr[i][j]=s.nextInt();
        }
        //System.out.print(arr[i][0]+"hh\t"+arr[i][1]);
        adjMat[(arr[i][0])][(arr[i][1])]=arr[i][2];
        }
        int source=s.nextInt();
        int dest=s.nextInt();
        int q=s.nextInt();
        int blocked[][]=new int[q][2];
        for(int i=0;i<q;i++){
        for(int j=0;j<2;j++){
        blocked[i][j]=s.nextInt();
        }
        }
      
        for(int i=0;i<blocked.length;i++){
        findpath(source,dest,adjMat,blocked[i][0],blocked[i][1]);
        }
       
    }

    static int findpath(int source, int dest, int [][]adjMat,int sblock, int sdest){
        int ncity=adjMat.length;
                
        int dis[]=new int[ncity];
        boolean spset[]=new boolean[ncity];
        
       for(int k=0;k<adjMat.length;k++){
        dis[k]=Integer.MAX_VALUE;
        spset[k]=false;
        }
        dis[source]=0;
         int min;
        for(int c=0;c<adjMat.length;c++){
            min=findmindis(dis,spset);
            if(min!=-1){
           // System.out.print("*****"+min);
            spset[min]=true;
            if(min==dest){
             System.out.println(dis[min]);
             return 0;

            }
            //else if()
            // System.out.println("**********"+min+""+spset[min]);
            for(int k=0;k<dis.length;k++){
                if(!spset[k]&&adjMat[min][k]!=0 &&dis[k]>dis[min]+adjMat[min][k] && ((min!=sblock && min!=sdest) || (k!=sblock && k!=sdest))){
                    
                    dis[k]=dis[min]+adjMat[min][k];
                    //System.out.print("are u executing"+ k+"\t"+dis[k]);
                }
            }
            }
            else{
                System.out.println("Infinity");
             return 0;
            }
        }
        
        System.out.println("Infinity");
        return 0;
    }
    
  static int findmindis(int[] dis, boolean spset[]){
      int min=Integer.MAX_VALUE;
      int min_Index=-1;
      for(int c=0;c<dis.length;c++){
          //System.out.println("spset"+spset[c]);
          if(min>dis[c]&&!spset[c]){
         /// System.out.println("spset"+spset[c]+""+c);
          min=dis[c];
          min_Index=c;
          }
      }
      return min_Index;
  }
    
}