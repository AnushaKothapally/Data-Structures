package learnjava;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anusha
 */
public class ColumnRemoval {
    static int[][] constructSubmatrix(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete) {
        int n1=matrix.length;
        int n2=matrix[0].length;
        int l=0,m=0;
         int [][]newarr=new int[n1-rowsToDelete.length][n2-columnsToDelete.length];
        // System.out.print(rowsToDelete.length+"\t"+(n-columnsToDelete.length)+"***\n");
    for(int i=0;i<matrix.length;i++){  
        if(isrowcol(i,rowsToDelete)){
                         m=0;
       //System.out.println("i"+i);
        for(int j=0;j<matrix[i].length;j++){
         if(isrowcol(j,columnsToDelete)){

            // System.out.println("j"+j+"l"+l+"m"+m);
            // System.out.println(matrix[i][j]);
             newarr[l][m]=matrix[i][j];
             m++;
         }
        }
        l++;
        }
    }
    System.out.println();

    for(int i=0;i<newarr.length;i++){
    for(int j=0;j<newarr[i].length;j++){
    System.out.print("  "+newarr[i][j]);
    }
    System.out.println();
    }
    return newarr;

}
   public static boolean isrowcol(int i,int[] rowcol){
        int k;
       
       
       for(k=0;k<rowcol.length;k++){
           if(i==rowcol[k])
               return false;
        }
       
       return true;
   }
    public static void main(String args[]){
        int arr[][]=new int[3][4];
        int rowsToDelete[]=new int[1];
        //rowsToDelete[0]=0;
        int columnsToDelete[]=new int[1];
        columnsToDelete[0]=0;
        //columnsToDelete[0]=2;
        int max=10, min=0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= s.nextInt();///(int)(Math.random()*10);
            }
        }
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[i].length;j++){
                    System.out.print("  "+arr[i][j]);
              }
              System.out.println();
    }
        constructSubmatrix(arr, rowsToDelete,columnsToDelete);
    }
    
}
