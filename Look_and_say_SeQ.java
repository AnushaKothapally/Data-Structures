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
public class Look_and_say_SeQ {
    
  static String sequence(int num){
  
  if(num==1)
    return "1";
  else if(num==2)
    return "11";
  
  String str="11";
  int count=0;
  
  for(int i=3;i<=num;i++){
      count=1;  
      str+="#";
      String tmp="";
    for(int j=1;j<str.length();j++){
      if(str.charAt(j)!=str.charAt(j-1)){
        tmp+=""+count+str.charAt(j-1);
        count=1;
        //System.out.println(str+""+tmp);
      }
      else
        count++;
      
    }
    str=tmp;
   // System.out.println(str);
  }
  
  return str;
}
  
  public static void main(String args[]){
      System.out.println(sequence(5));
  }
}
