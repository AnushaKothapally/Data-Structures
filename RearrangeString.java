/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.HashMap;

/**
 *
 * @author Anusha
 */
public class RearrangeString {
    
    public static void main(String args[]){
        String st="AFBKC2DZE4L";
        int sum=0;
        String resultStr="";
        HashMap<Character,Integer> hashmap=new HashMap();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='A'&&st.charAt(i)<='Z'){
            if(hashmap.get(st.charAt(i))==null)
                hashmap.put(st.charAt(i),0);
            hashmap.put(st.charAt(i),hashmap.get(st.charAt(i))+1);
        }else{
            sum+=st.charAt(i)-'0';
            }
            
        }
        for(int i=0;i<26;i++){
            char c=(char)('A'+i);
            //System.out.println(hashmap.get(c));
            if(hashmap.get(c)!=null){
                
                while(hashmap.get(c)>0){
                    resultStr+=c;
                    int val=hashmap.get(c)-1;
                    hashmap.put(c, val);
                }
            }
        }
        resultStr+=""+sum;
        System.out.print(resultStr);
        
    }
    
}
