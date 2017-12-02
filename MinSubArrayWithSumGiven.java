/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

/**
 *
 * @author Anusha
 */
public class MinSubArrayWithSumGiven {
    public static void main(String args[]){
        int arr[]=new int[]{1, 4, 5, 6, 0, 51};
      //                     s                
      //                                     e 
        System.out.println(minSubArray(arr,51));
        
    }
    static int minSubArray(int[] a, int sum){
         int start=-1;
         int end=-1;
         int calSum=0;
         int minSubArraySize=a.length+1;
         while(end<a.length-1){
           while(calSum<=sum&&end<a.length-1){
             calSum+=a[++end];
             //end++;
           }
           //System.out.println(end);
           while(calSum>=sum&&start<a.length-1){

            calSum-=a[++start];
            if(end-start<minSubArraySize){
                 minSubArraySize=end-start; 
            } 
           }
           //System.out.println(start);
           System.out.println("start"+start+"end"+end+"min"+minSubArraySize);
         }
        return minSubArraySize+1; 
       }
}
