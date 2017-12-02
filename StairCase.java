/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Scanner;

/**
 *
 * @author srishailamdasari1
 */
public class StairCase {
    void method(){
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
            System.out.print("jooo");
        for(int i=1;i<=n;i++){
            int j=i;
            while(j<n){
                System.out.print(" ");
                j++;
            }
            j=i;
            while(j>0){
                System.out.print("#"); 
                j--;
            }
            System.out.println();
            
        }
            }
    public static void main(String args[]){
          StairCase s=new StairCase();
        s.method();
        }

}
