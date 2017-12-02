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
public class ReverseStringPreservingSpaces {
    static void reverse(String st){
    int i=0;
    int j=st.length()-1;
    while(i<st.length()&&j>=0){
        //System.out.println(i+"\t"+j);
        if(st.charAt(i)!=' '&&st.charAt(j)!=' '){
            System.out.print(st.charAt(j));
            j--;
            i++;
            
            }
        else if(st.charAt(j)==' '&&st.charAt(i)==' '){
             System.out.print(st.charAt(j));
            j--;
            i++;
        }
        else if(st.charAt(j)==' '){
            j--;
        }
        else if(st.charAt(i)==' '){
            System.out.print(" ");
            i++;
        }
    }
    
    }
    public static void reverseWords(String st){
        String arr[]=st.split(" ");
        //System.out.println(arr.length-1);
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String args[]){
        String st="My Name is Anusha";
        reverse(st);
        System.out.println("");
        reverseWords(st);
      
    }
}
