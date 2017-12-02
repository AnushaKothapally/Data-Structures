package learnjava;

import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srishailamdasari1
 * Using one extra stack
 */
public class Stacksort {
    
    Stack<Integer> sortstack(Stack<Integer> st1){
    
        if(st1==null||st1.empty()||st1.size()==1){
            return st1;
        }
        Stack<Integer> st2=new Stack();
        st2.push(st1.pop());
        while(!st1.isEmpty()){
           int temp=st1.pop();
           while(!st2.isEmpty()&&temp>st2.peek()){
               st1.push(st2.pop());
           }
           st2.push(temp);
        }
        return st2;
    }
    Stack<Integer> sortInplace(Stack<Integer> st1){
             int temp=st1.pop();
             if(!st1.isEmpty()){
                sortInplace(st1);
            }
            sort(st1,temp);
         return st1;
        
    }
    void sort( Stack st,int temp){
        int var=!st.isEmpty()?Integer.parseInt(st.peek().toString()):-1;
        //int ele=-1;
        if(st.isEmpty()||var<=temp){
            st.push(temp);
        }
        else{
          int ele=(int)st.pop();
         sort(st,temp);
         st.push(ele);
        }
        
    }
    
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(4);
        st.push(2);
        st.push(1);
        st.push(3);
        Stacksort s=new Stacksort();
        st=s.sortInplace(st); 
        while(!st.isEmpty())
        System.out.println(st.pop());
    }
}
