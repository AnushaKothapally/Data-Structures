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
public class NoofDecoding {
  static int decod(String st){
    if(st.length()==0)
      return 0;
   else if(st.length()==1){
      return 1;
    }
  int count=1;
  for(int i=1;i<st.length();i++){
     int n1=st.charAt(i-1)-'0';
     int n2=st.charAt(i)-'0';
    String num=+n1+""+n2;
   // System.out.println(num);
   if(true){
      count+=2;
    }
    else{
      count++;
    }
    
  }
  return count;
  }
  public static void main(String args[]){
      System.out.println(decod("1111"));
                                
  }
}
