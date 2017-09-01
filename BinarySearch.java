/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Anusha K
 */
public class BinarySearch {
    
    boolean binarysearch(int[] array, int key){
        int left=0;
        int mid=0;
        int right=array.length-1;
        while(left<right){
         mid=left+(right-left)/2;
         System.out.println(mid);
         if(array[mid]<key){
         left=mid+1;
         }
         else if(array[mid]>key){
         right=mid-1;
         }
         else
             return true;
        }
        
        return false;
    }
  
 public static void main(String args[]){
 
     int arr[]=new int[]{10,11,12,13,14,15};
     BinarySearch bs=new BinarySearch();
     System.out.println(bs.binarysearch(arr, 9));
     
 }
 
    
}
