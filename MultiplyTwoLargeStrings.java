/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author Anusha
 */
public class MultiplyTwoLargeStrings {
    static String withBigInteger(String st1,String st2){
        BigInteger n1=new BigInteger(st1,10);
        BigInteger n2=new BigInteger(st2,10);
        BigInteger r = null;
        if(n1!=null && n2!=null){
            r=n1.multiply(n2);
        }
        System.out.println(r.toString());
        return r.toString();
    }
    static void manualMultiplication(String st1,String st2){
        int i=st1.length();
        int j=st2.length();
        int product[]=new int[i+j];
        for(int l1=i-1;l1>=0;l1--){
            int carry=0;
            int n1=st1.charAt(l1)-'0';
            for(int l2=j-1;l2>=0;l2--){
               int n2=st2.charAt(l2)-'0';
              product[l1+l2+1]+=n1*n2;
            }
        //System.out.println("over\n\n");
        }
        int carry=0;
        for(int k=product.length-1;k>0;k--){
            int tmp=(product[k]+carry)%10;
            carry=(product[k]+carry)/10;
            product[k]=tmp;
            
        }
        
       System.out.println(Arrays.toString(product));
    
    }
    public static void main(String args[]){
        String st1="14262411258";
        String st2="14262411258";
        withBigInteger(st1,st2);
        manualMultiplication(st1,st2);
    }
    
}
