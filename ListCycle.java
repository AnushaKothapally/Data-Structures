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
public class ListCycle {
    private class Node{
        Node next;
        int value;
    }
   Node hasCycle(Node head) {
    Node slow, fast;
    slow= head;
    fast= head.next;
    while(true){
        if(slow==null||slow.next!=null||fast==null||fast.next==null||fast.next.next==null){
            return null;
        }
        if(slow!=fast){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow==fast){
            fast=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
    }          
    }
    //return false;
}
 

