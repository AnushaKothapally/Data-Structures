/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Anusha
 */
public class GiveNthLastNode {
   void give(Node root, int nn){
       Node n=root;
       int listSize=0;
       while(n!=null){
       n=n.next;
       listSize++;
       }
       int m=listSize-nn;
       while(m>0){
       n=n.next;
       m--;
       }
       System.out.println(n.data);
   }
}

