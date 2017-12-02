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
public class ExcelColumnNametoNumber {
    	public static int titleToNumber(String a) {
	    //int add=26;
	    int result=0;
	    for(int i=0;i<a.length();i++){
	            int ascii= (int) a.charAt(i);
	            result=result*26+(ascii-64);
	    }
	    return result;
	}
        public static void main(String args[]){
            System.out.println(titleToNumber("AAA"));
        }
}
