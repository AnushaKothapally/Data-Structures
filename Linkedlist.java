/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Anusha K
 */
public class Linkedlist {
    LinkedList<Object> ist=new LinkedList();
       public static void main(String arg[]){
         Linkedlist ls=new Linkedlist();
         ls.ist.add("Anusha");
         ls.ist.add("Srishailam");
         ls.ist.addFirst("Mentu");
         ls.ist.addLast("Dasari");
         ls.ist.add(2, "Second");
         //ls.ist.
         Iterator it=ls.ist.descendingIterator();
         while(it.hasNext()){
         System.out.println(it.next());
         }
    }
}
