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
public class LongestPalindromicSubstring {
    public static void main(String args[]){
        String st="Lalindnilap";
        longestSubString(st);
    }
    static void longestSubString(String st){
        boolean table[][]=new boolean[st.length()][st.length()];
        int start=0;
        int maxlength=0;
        for(int k=0;k<st.length();k++){
            table[k][k]=true;
            //maxlength=1;
        }
        for(int k=0;k<st.length()-1;k++){
            if(st.charAt(k)==st.charAt(k+1)){
                table[k][k+1]=true;
                start=k;
                maxlength=1;
            }
        }
        //for length greater than 3 check
        for(int k=3;k<=st.length();k++){
            //System.out.println(k);
            for(int i=0;i<=(st.length()-k);i++){
                int j=i+k-1;
                //System.out.println(k+"  "+table[i+1][j-1]+"  "+ st.charAt(i)+"  "+st.charAt(j)+"\t"+i+" "+j);
                if(table[i+1][j-1]==true&& st.charAt(i)==st.charAt(j)){
                    table[i][j]=true;
                    if(k>maxlength){
                           maxlength=k;
                           start=i;
                    }
                }
            }
        }
        System.out.println(st.substring(start,start+maxlength)+"Max Length"+maxlength);
    }
}
