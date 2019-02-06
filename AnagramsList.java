/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Anusha
 */
public class AnagramsList {
    public static Collection<List<String>> isAnagram(ArrayList<String> str){
        HashMap<String,List<String>> map=new HashMap();
        for(String st:str){
            String sortedKey= sort(st);
            if(map.containsKey(sortedKey)){
                map.get(sortedKey).add(st);
            }
            else{
                map.put(sortedKey, new ArrayList<String>(Arrays.asList(new String(st))));
            }
        }
        return map.values();
    }
    public static String sort(String st){
        char stArray[]=st.toCharArray();
        Arrays.sort(stArray);
        return new String(stArray);
        
    }
    public static void main(String args[]){
        ArrayList l=new ArrayList();
        l.add("STREET");
        l.add("ERESTT");
        l.add("AUNG");
        l.add("GUNA");
        l.add("NUGA");
        l.add("Git Example");
              
        System.out.println(isAnagram(l).toString());
    }
}
