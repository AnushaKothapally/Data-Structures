package learnjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anusha K 
 * Repeatedly sorts adjacent elements
 */
public class Bubblesort {
    void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length;j++){
         if(arr[j-1]>arr[j]){
         int temp=arr[j-1];
         arr[j-1]=arr[j];
         arr[j]=temp;
         }
        }
        }
      //  return arr;
    }
    public static void main(String args[]){
      int array[]=new int[]{0,3,12,6,2,8,9,2,5,4,1};
      InsertionSort ins=new InsertionSort();
      array=ins.sort(array);
      for(int i=0;i<array.length;i++)
          System.out.println(array[i]);
  }
}
