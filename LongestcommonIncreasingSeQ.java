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
public class LongestcommonIncreasingSeQ {
    // 3,1,2,4,6,5,8
    /* 1,1,2,2,1,1,1
     3,4,6,8
    1,2,4,6,8
    
    
    */
    public static int LIS(int[] arr){
        int maxSeqCount[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            maxSeqCount[i]=1;
        }
        int max=Integer.MIN_VALUE;
       for(int i=1;i<arr.length;i++){
            // System.out.println( maxSeqCount[1]+"\t"+i);
            for(int j=0;j<i;j++){
                //System.out.println(maxSeqCount[i]+"  "+arr[j]+"   "+arr[i]);
                if(arr[j]<arr[i]&&maxSeqCount[i]<maxSeqCount[j]+1){
                    maxSeqCount[i]++;
                   // System.out.println( maxSeqCount[i]);
                    if(max < maxSeqCount[i]){
                        max=maxSeqCount[i];
                    }
                }
            }
        }
    return max;
    }
    public static void main(String args[]){
        int arr[]= new int[]{3,1,2,4,6,5,8};
       System.out.println(LIS(arr));
        
    }
    
}
