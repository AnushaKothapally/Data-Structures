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
public class StringPermutation {
    static void permute(String str, int st, int end){
        if(st==end)
            System.out.println(str);
        else{
            for(int current=st;current<=end;current++)
            {
                str=swap(str,current,st);
                permute(str,st+1,end);
                System.out.println(current);
                str=swap(str,current,st);
            }
        }
    
    }
    static String swap(String str,int i,int j){
        StringBuilder st=new StringBuilder(str);
        char c=st.charAt(i);
        st.setCharAt(i, st.charAt(j));
        st.setCharAt(j, c);
        return st.toString();
    }
    public static void main(String args[]){
        permute("ABC",0,2);
    }
}
