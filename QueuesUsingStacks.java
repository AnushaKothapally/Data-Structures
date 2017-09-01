/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Stack;

/**
 *
 * @author Anusha K
 */
public class QueuesUsingStacks {
    Stack st1, st2;
    int top=-1;
    int size;
    void  Enqueue(Object ele){
        st1.push(ele);
        top++;
    }
    Object Dequeue(){
    Object st;
    if(st1.isEmpty()&&st2.isEmpty()){
        return "Queue is Empty";
    }
    else if(!st2.isEmpty()){
    st=st2.pop();
    }
    else{
    while(!st1.isEmpty()){
    st2.push(st1.pop());
    }
    st=st2.pop();
    }
    return st;
    }
    public static void main(String args[]){
    QueuesUsingStacks q=new QueuesUsingStacks();
    q.st1=new Stack();
    q.st2=new Stack();
    q.Enqueue("A");
    q.Enqueue("B");
    System.out.println(q.Dequeue());
    q.Enqueue("C");
    q.Enqueue("D");
    System.out.println(q.Dequeue());
    System.out.println(q.Dequeue());
    System.out.println(q.Dequeue());
    System.out.println(q.Dequeue());
    q.Enqueue("F");
    System.out.println(q.Dequeue());
    }
}
