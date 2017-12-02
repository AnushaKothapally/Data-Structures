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
public class StringCompression {
    public static void main(String args[]){
        String st="aaabbbbcccccd";
        int count=0;
        int i=0;
        for(;i<st.length();i++){
            if(i==0){
           // count++;
            }
            else if(st.charAt(i)==st.charAt(i-1)){
            count++;
            }
            else{
            
            System.out.print(st.charAt(i-1)+""+(count+1));
            count=0;
            }
        }
        System.out.print(st.charAt(i-1)+""+(count+1));
    }
}
