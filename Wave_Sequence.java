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
 * @author Anusha
 */
public class Wave_Sequence {
    	public static ArrayList<Integer> wave(ArrayList<Integer> a) {
            Collections.sort(a);
           // int []arr= a.toArray(new int[a.size()]);
	    for(int i=0;i<a.size()-1;i+=2){
                int tmp=a.get(i);
                a.set(i, a.get(i+1));
                a.set(i+1,tmp);
              //System.out.println(a.size());
            }
            for(int i:a){
            System.out.print(i+" ");
            }
	    return a;
	}
        public static void main(String args[]){
            ArrayList<Integer> arr=new ArrayList();
            arr.add(5); //0
            arr.add(1);
            arr.add(2); //2
            arr.add(3);
            arr.add(4); //
            wave(arr);
        }
        
}
