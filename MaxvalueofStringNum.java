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
public class MaxvalueofStringNum {
    
static int maxValue(String st){
  int result=0;
  int j=0;
  for(int i=1;i<st.length()-1;i++){
      int n1=st.charAt(i-1)-'0';
      int n2=st.charAt(i)-'0';
    if(n1==0||n1==1||n2==0||n2==1){
        result+=n1+n2;
    }
    else{
      
      result+=n1*n2;
    }
    
  }
return result;
}

public static void main(String args[]){
    System.out.println(maxValue("01231"));
}
}
