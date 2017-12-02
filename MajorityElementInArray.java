/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Anusha
 */
public class MajorityElementInArray {
    	public static int majorityElement(final List<Integer> a) {
	    int count=Integer.MIN_VALUE;;
	    int element=Integer.MIN_VALUE;
	    HashMap<Integer,Integer> map=new HashMap();
	    for(int i=0;i<a.size();i++){
               // System.out.println(i+""+a.size());
	        if(map.get(a.get(i))==null){
	            map.put(a.get(i),0);
	        }
	        map.put(a.get(i),map.get(a.get(i))+1);
	        if(count<map.get(a.get(i))){
	            count=map.get(a.get(i));
	            element=a.get(i);
	        }
	        if(count>(a.size())/2){
	            return element;
	        }
                //System.out.println(i+""+a.size());

	    }
	    return element;
	}
        public static void main(String args[]){
            List<Integer> list=new ArrayList();
            list.add(2);
            list.add(1);
            list.add(2);
            
           System.out.println(majorityElement(list));
                    
        }
}
