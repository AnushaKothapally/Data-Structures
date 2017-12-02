/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.Stack;

/**
 *
 * @author Anusha
 */
public class DecodeString {
    public static void main(String args[]){
        String st="3[b2[ca]]";
       System.out.println(decodeString(st));
    
    }
    
  static StringBuilder decodeString(String str){
  int i=0;
  Stack<Integer> integerStack = new Stack();
  Stack<Character> characterStack = new Stack();
  String newStr="";
  while(i<str.length()){
    if(Character.isDigit(str.charAt(i))){
      integerStack.push(str.charAt(i)-'0');
      
    }else{
      characterStack.push(str.charAt(i));
    }
    i++;
  }
       
   while(!characterStack.isEmpty()){
     
     while(characterStack.peek()!='['){
      if(characterStack.peek()==']'){
          characterStack.pop();
      }else{
        newStr+=characterStack.pop();
      
      }
      }
     characterStack.pop();
     int ntimes=0;
      if(!integerStack.isEmpty())
         ntimes=integerStack.pop();
            String repeat="";
      while(ntimes>0){
        repeat+=newStr;   
          
         ntimes--;
                }
      newStr=repeat;
       }    
    return new StringBuilder(newStr).reverse(); 
}
}
