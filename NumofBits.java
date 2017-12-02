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
public class NumofBits {
   	public int numSetBits(long a) {
	    int count=0;
	    while(a>0){
	    int num= (int)a%2;
	    if(num==1)
	        count++;
	    a= a>>1;
	    }
	    
	    return count;
	} 
}
