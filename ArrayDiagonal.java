/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author srishailamdasari1
 */
public class ArrayDiagonal {
    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
	    
	    ArrayList<ArrayList<Integer>> list=new ArrayList();
	    for(int i=0;i<a.size();i++){
	         ArrayList<Integer> l= new ArrayList();
	        for(int j=0,k=i;j<=i&&k>=0;j++,k--){
	            l.add(a.get(k).get(j));
	        }
	        list.add(l);
	    }
	    
	    for(int k=1;k<a.size();k--){
	        int i=a.size()-1;
	        ArrayList<Integer> l= new ArrayList();
	       for(int j=k;j<a.size();j++){
	           l.add(a.get(i).get(j));
	           i--;
	       }
               Collections.reverse(l);
	       list.add(l);
	    }
	   return list; 
	    
	}
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> arr= new ArrayList();
        ArrayList<Integer> l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        arr.add(l);
        ArrayList<Integer> l1=new ArrayList();
        l1.add(4);
        l1.add(5);
        l1.add(6);
        arr.add(l1);
        ArrayList<Integer> l2=new ArrayList();
        l2.add(7);
        l2.add(8);
        l2.add(9);
        arr.add(l2);
        diagonal(arr);
    }
}
