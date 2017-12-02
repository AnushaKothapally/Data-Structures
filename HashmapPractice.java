/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Anusha
 */
public class HashmapPractice {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        //withMap(list);
        withXor(list);
    }
    
 static void withXor(List<Integer>list){
     int num=list.get(0);
     for(int i=1;i<list.size();i++){
         num=num ^ list.get(i);
     }
     System.out.print(num);
 
 }
 static void withMap(List<Integer> list){
   Map<Integer,Integer> h= new HashMap<>();
           for(int i=0;i<list.size();i++){
            if(h.get(list.get(i))!=null){
                h.put(list.get(i), h.get(list.get(i))+1);
            }
            else{
                h.put(list.get(i),1);
            }
        }
        for(int i:h.keySet()){
            if(h.get(i)==1){
            System.out.println(i);
            break;
            }
        }
 }
    
}
