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
public class GCD {
    	public static int gcd(int a, int b) {
	    int num1=0;
	    int num2=0;
	    int gcd=0;
	    if(a>b){
	        num1=a;
	        num2=b;
	    }else{
	        num1=b;
	        num2=a;
	    }
	    while(num2>0){
                int tmp=num1;
	        num1=num2;
	        num2=tmp%num2;
                System.out.print(num1+"\t"+num2+"\n");
	    }
	    return num1;
	}
        public static void main(String args[]){
            System.out.println(gcd(4,6));
        }
}
