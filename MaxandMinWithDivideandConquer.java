/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb.trees;

/**
 *
 * @author Anusha
 */
public class MaxandMinWithDivideandConquer {
    static void findMaxandMin(int []arr,int st,int end,int min, int max){
           if(st<end){
               int mid=(st+end)/2;
               findMaxandMin(arr,st,mid,min,max);
               findMaxandMin(arr, mid, end,min,max);
               
              // calculateMinMax(arr,st,mid,end,min,max);
           }
                
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,5,3,2,4};
        findMaxandMin(arr,0,arr.length-1,0,0);
    }
}
