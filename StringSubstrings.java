/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Anusha
 * Subsets
 */
public class StringSubstrings {
    static void substr(char[] str,int count){
        str=removeDuplicates(str);
        List result=new ArrayList();
        List current;
        for(int i=0;i<1<<str.length;i++){
            System.out.print(i+"{");
            int check=count;
            current=new ArrayList();
            for(int j=0;j<str.length;j++){
             //    System.out.println((1<<j)+"\t"+i+"\t"+(i&(1<<j)));
           
                if((i&(1<<j))>0){
                    System.out.print(""+str[j]);
                    current.add(str[j]);        
                    check--;
                }
            }
            if(check==0)
                result.add(current);
           System.out.println("}"+""+count);
        }
        System.out.println(result.toString());
    }
    static char[] removeDuplicates(char[] str){
        HashMap<Character,String> h=new HashMap();
        int i=str.length-1;
        
        while(i>=0){
            if(h.containsKey(str[i])){
            }
            else{
                h.put(str[i], null);
            }
            i--;
        }
        //System.out.println((h.keySet()).toString());
        char arr[]=new char[h.size()];
        int k=0;
        for(char c:h.keySet()){
        arr[k]=c;
        k++;
        }
         return arr;       
       
    }
    static void SubsetsRecursive(char[] st){
        List<List<Character>> result=new ArrayList();
        ArrayList<Character> currentSet=new ArrayList();
        result=findSubset(result,st,0,currentSet,2);
        System.out.println(result.toString());
    }
     static List findSubset(List<List<Character>> result,char st[],int i,ArrayList<Character> current,int sum){
         if(sum==0){
             result.add(current);
             return result;
         }
         if(i>st.length-1){
            // result.add(current);
         return null;
         }
         //else{
       System.out.println(st[i]+""+sum);
        
         ArrayList newlist=(ArrayList<Character>)current.clone();
         newlist.add(st[i]);
         i++;
         findSubset(result, st, i,newlist,sum--);
         findSubset(result,st,i,(ArrayList<Character>)current.clone(),sum);
        // }
        
        return result; 
    }
    public static void main(String args[]){
        String st="ABCD";
        substr(st.toCharArray(),3);
       int arr[][]=new int[][]{{4,3},{2,1},{5,2}};
     //  Arrays.sort(arr[i],
    }
    
}
