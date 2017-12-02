/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb.trees;

/**
 *
 * @author Anusha
 */
public class ReverseLinkedlist {
    static class LinkNode{
        int data;
        LinkNode next;
    }
    static void printReverse(LinkNode root){
        if(root.next==null)
            return;
        printReverse(root.next);
        System.out.println(root.data);
    }
    public static void main(String args[]){
        LinkNode l=new LinkNode();
        l.data=1;
         LinkNode l1=new LinkNode();
         l1.data=2;
         l.next=l1;
          LinkNode l2=new LinkNode();
          l2.data=3;
          l1.next=l2;
           LinkNode l3=new LinkNode();
           l3.data=4;
           l2.next=l3;
        LinkNode l4=new LinkNode();
        l4.data=5;
        l3.next=l4;
        printReverse(l);
    }
    
}
