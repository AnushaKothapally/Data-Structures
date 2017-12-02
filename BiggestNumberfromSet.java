/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Anusha
 */
public class BiggestNumberfromSet {
    
    
    public static void main(String args[]){
    
        int arr[]=new int[]{54, 546, 548, 60};
        //Integer sorted[]= ArrayUtils.toObject(arr);
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    
   static void mergesort(int []arr,int start,int end){
       if(start<end){
           int mid= (start+end)/2;
           mergesort(arr,start,mid);
           mergesort(arr,mid+1,end);
           sort(arr,start,mid,end);
           
       }
       
   } 
   static void sort(int arr[],int start,int mid,int end){
       int L[]=new int[mid-start+1];
       int R[]=new int[end-mid];
       for(int i=0;i<L.length;i++){
           L[i]=arr[start+i];
          
       }
       for(int i=0;i<R.length;i++){
           R[i]=arr[mid+1+i];
          
       }
       int i=0;
       int j=0;
       int k=0;
       while(L.length>i||R.length>j){
           
           if(L.length>i&&R.length>j){
              String st1= L[i]+""+R[j];
              String st2= R[j]+""+L[i];
               if(st1.compareTo(st2)>0){
                   arr[start+k]=L[i];
                   i++;
               }
               else{
               arr[start+k]=R[j];
                   j++;
               }
                          }
           else if(L.length>i){
               arr[start+k]=L[i];
               i++;
           }
           else{
               arr[start+k]=R[j];
               j++;
           }
           k++;
       }

       
   
   }
    
}
