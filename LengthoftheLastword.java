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
public class LengthoftheLastword {
    	public static int lengthOfLastWord(String a) {
	    a=a.trim();
	    if(a.length()==0){
	        return 0;
	    }
	    String str="";
	    
	    int i=a.length()-1;
	    while(i>=0){
	        if(a.charAt(i)!=' '){
	            str+=a.charAt(i);
	        }
	        else{
	            break;
	        }
                i--;
	    }
	    return str.length();
	}
        public static void main(String args[]){
           System.out.println(lengthOfLastWord("India Country"));
        }
}
