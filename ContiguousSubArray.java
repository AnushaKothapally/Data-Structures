/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

/**
 *
 * @author Anusha
 * Largest Sum Contiguous Subarray
2.6
Write an efficient C program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
 */
public class ContiguousSubArray {
    public static void main(String args[]){
        int arr[]=new int[]{0, -1, 2, -3, 1};
        int start=0;
        int end=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
           // sum=Math.max(arr[i], sum+arr[i]);
            if(arr[i]>sum+arr[i]){
                sum=arr[i];
            }
            else{
            sum=sum+arr[i];
            }
            if(maxSum<sum){
                maxSum=sum;
                end=i;
            }
                    }
        
        System.out.println(maxSum+"\t"+start+"\t"+end);
    }
    
}
