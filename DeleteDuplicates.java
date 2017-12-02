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
public class DeleteDuplicates {
        private  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
   	public ListNode deleteDuplicates(ListNode a) {
	    ListNode current=a;
	    while(current!=null&&current.next!=null){
	        if(current.val==current.next.val){
	            current.next=current.next.next;
	        }
	        else{
	            current=current.next;
	        }
	    }
	    return a;
	} 
}
