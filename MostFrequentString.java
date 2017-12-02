/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.HashMap;

/**
 *
 * @author srishailamdasari1
 */
public class MostFrequentString {
    
    public static void main(String args[]){
    String array[]=new String[]{"aab","bb","aab","sri","gram","sri","pacific","sri"};
        HashMap hm= new HashMap();
        String most=null;
        int nooftimes=0;
        for(int i=0;i<array.length;i++){
            String st=array[i].toLowerCase();
            if(hm.containsKey(st)){
                int value=(int)hm.get(st);
                hm.put(st, ++value);
                if(nooftimes<Integer.parseInt(hm.get(st).toString())){
                    nooftimes=Integer.parseInt(hm.get(st).toString());
                    most=st;
                }
            }
            else{
                hm.put(st, 1);
            }
        }
        System.out.println(most+""+nooftimes);
    
    }
    
}
