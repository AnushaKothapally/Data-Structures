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
public class PalindromewithoutSpaces {
    public static void main(String args[]){
        String st="raceecar";
        st=st.replace(" ", "");
        int i=0;
        boolean ispalindrome=true;
        int j=st.length()-1;
        while(i<j){
            if(st.charAt(i)==st.charAt(j)){
                i++;
                j--;
            }
            else{
                ispalindrome=false;
                break;
            }
        }
        System.out.println(ispalindrome+"st"+st);
    }
}
