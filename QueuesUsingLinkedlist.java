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
public class QueuesUsingLinkedlist {
    private Node rear;
    private Node front;
    private int size=0;

    public QueuesUsingLinkedlist() {
        this.rear=null;
        this.front=null;
    }
    void Print(Node head) {
    Node temp=head;
    boolean istrue=false;
    if(head==null)
        return;
    
    System.out.println(head.data);
    while(head.next!=null){
       // System.out.println("data"+head.data);
        head=head.next;  
        System.out.println(head.data);
    }
  
}
    
    void Enqueue(int key){
        Node prevNode=rear;
           rear=new Node(key);
           if(size==0){
           front=rear;
           }
           else{
           //System.out.println(prevNode);
           prevNode.next=rear;
           }
           size++;
          // System.out.println(size);
       }
    int Dequeue(){
    if(front==null&&size==0){
    return -1;
    }
    int n=front.data;
    front=front.next;
    size--;
    return n;   
    }
    public static void main(String args[])
    {
          QueuesUsingLinkedlist ql=new QueuesUsingLinkedlist();
          ql.Enqueue(2);
          ql.Enqueue(3);
          ql.Enqueue(4);
          System.out.println(ql.Dequeue());
          System.out.println(ql.Dequeue());
    
    }
    
 Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node newnode=new Node(data);
    //newnode.data=data;
    temp.next=newnode;
  return head;
}
Node InsertatHead(Node head,int x) {
  
// This is a "method-only" submission. 
// You only need to complete this method. 
    if(head!=null){
    //Node temp=head;
    Node newnode=new Node(x);
   // newnode.data=x;
    newnode.next=head;
     head=newnode;
  
    }
    else{
        if(head==null)
        head=new Node(x);
        //head.data=x;
    }
return head;
}
}
class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }