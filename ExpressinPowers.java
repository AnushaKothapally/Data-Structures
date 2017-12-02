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
public class ExpressinPowers {
    public static boolean isPower(int a) {
        if(a==1)
            return true;
        for(int i=2;i<=Math.sqrt(a);i++){
              
            for(int j=2;Math.pow(i,j)<=a;j++){
                
                //System.out.println(Math.pow(i,j)+"hi");
              if(Math.pow(i,j)==a){
                  return true;
              }  
            }
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(isPower(9));
    }
}
