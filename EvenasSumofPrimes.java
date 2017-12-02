/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Anusha
 */
public class EvenasSumofPrimes {
  public static void primesum(int a) {
        HashMap<Integer,Boolean> map=new HashMap();
        map.put(1,true);
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        ArrayList<Integer> list=new ArrayList();
        for(int i=2;i<a;i++){
            map.put(i,true);
        }
        for(int i=2;i*i<a;i++){
           // if(map.get(i)){
                for(int j=i*i;j<=a;j+=i){
                    map.put(j,false);
                }
           // }
            
                    
        }
        for(int i:map.keySet()){
            if(map.get(i)){
                //System.out.println(i);
                if(map.get(a-i)){
                    //if(!list.contains(i)){
                        if(i<=b&&a-i<c){
                        b=i;
                        c=a-i;
                        }
                        //list.add(i);
                        //list.add(a-i);
                   // }
                   // System.out.println(i+"\t"+(a-i));
                }
            }
                   }
        
        System.out.println(b+"\t"+c);
         for(int i:list){
             System.out.println(i);
         }

        }


      
  public static void main(String args[]){
      primesum(4);
  }
}
