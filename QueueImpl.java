/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Scanner;

/**
 *
 * @author Anusha K
 */
public class QueueImpl {
    Object[] array;
    int capacity;
    int head=-1, tail=-1;
        
    void capacity(){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter Size Limt:");
     capacity= s.nextInt();
    array= new Object[capacity];
            }
    
    void Enqueue(Object element) throws Exception{
        if(isFull()){
        throw new Exception("Queue is full");
        }
        else if(isEmpty()){
        head=0;
        tail=0;
        
        }
        else{
             tail=(tail+1)%capacity;
        }  
        array[tail]=element;
    }
    void Dequee() throws Exception{
        if(isEmpty()){
        throw new Exception("Queue is emplty");
        }
        else if(head==tail)
        {
        head=-1;
        tail=-1;
        }
        else{
        head=(head+1)%capacity;
        }
        array[head]=null;
    }
    
    Object front(){
    return array[head];
    }
    
    boolean isEmpty(){ 
       if(head==-1&& tail==-1){
       return true;
       }
       return false;
    }
    boolean isFull(){
        return ((tail+1)%capacity==head);
    }
    
 public static void main(String args[]) throws Exception{
      QueueImpl que= new QueueImpl(); 
     que.capacity();
    Scanner s= new Scanner(System.in);
    System.out.println("Enter element to add:");
     Object element=s.next();
     que.Enqueue(element);
     System.out.println("Enter element to add:");
     Object element1=s.next();
     que.Enqueue(element1);
     System.out.println("Enter element to add:");
     Object element2=s.next();
     que.Enqueue(element2);
     System.out.println("Enter element to add:");
     Object element3=s.next();
     que.Enqueue(element3);
     que.Dequee();
     System.out.println("Enter element to add:");
     Object element4=s.next();
     que.Enqueue(element4);
    for(int i=0;i<que.array.length;i++){
    System.out.println(que.array[i]+""+que.head+""+que.tail);
    }
 }
    
}
