/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.Stack;

/**
 *
 * @author srishailamdasari1
 */
public class LeafsfromPreOrder {
    public static void main(String args[]){
        int arr[]=new int[]{890, 325, 290,295, 530, 965};
        Stack<Integer> st=new Stack();
        boolean isleaf=false;
        for(int i=0,j=1;j<arr.length;i++,j++){
            isleaf=false;
            if(arr[i]>arr[j]){
                st.push(arr[i]);
            }else{
                while(!st.isEmpty()){
                    if((st.peek())<arr[j]){
                        isleaf=true;
                        st.pop();
                    }else{
                        break;
                    }
                }
                
            }
            if(isleaf){
            System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
