/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Anusha K
 */
public class DoubleLinkedList {
    private NNode front;
    private NNode rear;
    private int size;
    DoubleLinkedList(){
    this.front=null;
    this.rear=null;
    this.size=0;
    }
    void InsertNode(int data){
    NNode prev=rear;
    //System.out.println(rear);
    //NNode next=prev!=null?prev.next:null;
    rear=new NNode(data);
    if(front==null&&size==0){
    front=rear;
    }
    //rear.next=next;
    rear.previous=prev;
    size++;
   
    if(prev!=null){
        prev.next= rear;
        // System.out.println(prev.data);
    }
    // System.out.println(rear);
   
    }
    int DeleteNode(){
    NNode f=front;
    front=front!=null?front.next:null;
    //front.previous=null;
    return f!=null?f.data:0;
    }
    public static void main(String args[]){
    DoubleLinkedList dl=new DoubleLinkedList();
    dl.InsertNode(1);
    dl.InsertNode(3);
    dl.InsertNode(4);
    System.out.println(dl.front.next.data);
    System.out.println(dl.front.next.previous.data);
    System.out.println(dl.front.next.next.data);
    
    }
    
}
class NNode{
    int data;
    NNode next;
    NNode previous;
    NNode(int data){
    this.data=data;
    this.next=null;
    this.previous=null;
    }
}