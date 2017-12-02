/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Anusha
 */
public class CountNoofOnesinBitRep {
    public static void main(String args[]){
    int x=15;
    int sum=0;
    while(x>0){
    sum+=x%2;
    x>>=1;   
   // System.out.println(sum+"\t"+x);
    }
    System.out.println(sum);
    
     //int y=-16;
   // System.out.println(y>>1);
    //System.out.println(y>>>1);
    }
   
}
