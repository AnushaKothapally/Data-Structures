/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Anusha K
 * Always left sub array of after the pointer i will in state of sorted
 */
public class InsertionSort {
    
   int[] sort(int[] array){
       for(int i=1;i<array.length;i++){
           for(int j=i;j>0;j--){
           if(array[j-1]>array[j]){
               int temp=array[j];
               array[j]=array[j-1];
               array[j-1]=temp;
              }
           }
       }
       
     return array;  
   }
   
  public static void main(String args[]){
      int array[]=new int[]{4,3,2,5,1};
      InsertionSort ins=new InsertionSort();
      array=ins.sort(array);
      for(int i=0;i<array.length;i++)
          System.out.println(array[i]);
  }
    
}
