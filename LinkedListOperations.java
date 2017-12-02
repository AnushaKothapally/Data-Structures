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
public class LinkedListOperations {
 int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    
    while(headA!=null&&headB!=null){
        if(headA.data!=headB.data){
            return 0;
        }
        headA=headA.next;
        headB=headB.next;
    }
    if(headA==null&&headB==null){
        return 1;
    }
    return 0;
}
    
 Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node n=new Node(0);
    Node head=n;
    
    while(headA!=null||headB!=null){
        if(headA!=null&&headB!=null){
            if(headA.data<=headB.data){
                n.next=headA;
                headA=headA.next;
            }
            else{
                n.next=headB;
                headB=headB.next;
            }

        }
        else if(headA!=null){
            n.next=headA;
             headA=headA.next;
        }
         else if(headB!=null){
                n.next=headB;
                headB=headB.next;
            }
           n=n.next;
    }
    
    return head;
}
 
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node temp=head;
    int len=0;
    while(temp!=null){
        len++;
        temp=temp.next;
    }
    temp=head;
    for(int i=1;i<(len-n);i++){
        temp=temp.next;
    }
    return temp.data;
}

boolean hasCycle(Node head) {
    Node slow, fast;
    slow= head;
    fast= head;
    while(slow!=null && fast!=null && fast.next !=null){
      slow= slow.next;
      fast= fast.next.next;  
      if(slow==fast)
          return true;
    }
    return false;
}
void divideTwohalves(Node root){
    Node head=root;
    Node fast=root.next;
    while(fast!=null){
        fast=fast.next;
        fast=fast!=null?fast.next:null;
        root=root.next;
    }
    Node newhead=root.next;
    root.next=null;
}


}
