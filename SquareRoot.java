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
public class SquareRoot {
    static int squareroot(int a){
        int st=0;
        int end=a/2;
        int midfloor=Integer.MIN_VALUE;
        while(st<=end){
            int mid=(st+end)/2;
            if(mid*mid==a){
                return mid;
            }
            else if(mid*mid<a){
                if(midfloor<mid*mid)
                    midfloor=mid;
                st=mid+1;
            }
            else if(mid*mid>a){
                end=mid-1;
            }
            //System.out.println(mid+""+st+""+end);
        }
        return midfloor;
    }
    public static void main(String args[]){
        int x=6;
        System.out.println(squareroot(x));
        
    }
    
}
