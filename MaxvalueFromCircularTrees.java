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
public class MaxvalueFromCircularTrees {
    
    public static void main(String args[]){
        int treevalues[]=new int[]{2,1,3,5,0,1,4};
        int nsecs=3;
        int maxSum=0;
        for(int i=0;i<treevalues.length;i++){
            int sum=0;
            for(int j=1;j<=nsecs;j++){
                sum=sum+treevalues[(i+j)%treevalues.length];
            }
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        
        System.out.println(maxSum);
    }
    
}
