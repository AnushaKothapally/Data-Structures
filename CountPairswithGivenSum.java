/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import static fb.HashmapPractice.withXor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Anusha
Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
* If there is such a triplet present in array, then print the triplet and return true.
* Else return false. For example, if the given array is {12, 3, 4, 1, 6, 9} and given sum is 24,
* then there is a triplet (12, 3 and 9) present in array whose sum is 24.


*/
public class CountPairswithGivenSum {
    public static void main(String args[]){
    
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        //System.out.println("\nhi"+withMap(list,4));
        //withXor(list);
        withooutMapTriplet(list,15);
    

    
    }
    
    static List withooutMapTriplet(List<Integer> list,int sum){
        Collections.sort(list);
        List<List<Integer>> tripletList=new ArrayList();
        boolean found =false;
       for(int i=0;i<list.size();i++){
           int j=i+1;
           int k=list.size()-1;
           while(j<k){
               if(list.get(i)+list.get(j)+list.get(k)==sum){
                   List<Integer> triplet=new ArrayList();
                   triplet.add(list.get(i));
                   triplet.add(list.get(j));
                   triplet.add(list.get(k));
                   tripletList.add(triplet);
                   j++;
                   k--;
                   found =true;
               }
               else if(list.get(i)+list.get(j)+list.get(k)<sum){
                   j++;
               }
               else
                   k--;
           }
       }
       for(List<Integer> i:tripletList){
           for(int j:i){
               System.out.print(j+" ");
           }
           System.out.println();
       }
       return tripletList;
    }
    static int withMap(ArrayList<Integer> list,int sum){
        int count=0;
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i))==null){
                  map.put(list.get(i), 0);
                  //System.out.println("hi"+map.get(list.get(i)));

            }
            map.put(list.get(i), map.get(list.get(i))+1);
            //System.out.println(map.get(list.get(i))+""+list.get(i));
        }
        
        for(int k:list){
           //System.out.print("hi"+(k));
         if(map.get(sum-k)!=null){
             count=count+map.get(sum-k);
             if((sum-k)==k){
             count--;
             }
         }    
        }
        
        //System.out.println(count);
        return count%2==0?count/2:count/2+1;
    }
    
    static void findtriplet(ArrayList<Integer> list,int sum){
        Map<Integer,Integer> map=new HashMap();
       int count=0;
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i))==null)
                map.put(list.get(i), 0);
            map.put(list.get(i),map.get(list.get(i))+1);
        }
        
        
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
               // System.out.println(map.get(sum-(list.get(i)+list.get(j)))+"sum"+sum+" \t"+(sum-(list.get(i)+list.get(j))));
                if(map.get(sum-(list.get(i)+list.get(j)))!=null){
                    //System.out.println(list.get(i)+"\t"+list.get(j)+"\t"+(sum-(list.get(i)+list.get(j))));
                     
                    count=count+map.get(sum-(list.get(i)+list.get(j)));
                    System.out.println(count+""+((sum-(list.get(i)+list.get(j))==list.get(i))||(sum-(list.get(i)+list.get(j))==list.get(j))));
                    if(((sum-(list.get(i)+list.get(j))==list.get(i))||(sum-(list.get(i)+list.get(j))==list.get(j)))){
                            count=count-1;
                            //System.out.print("pisa");
                    }
                     //System.out.println("\t"+count);
            
                }
            }
        }
        System.out.println(count/3);
        
    }
}
