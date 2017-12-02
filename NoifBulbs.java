package fb;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anusha
 */
public class NoifBulbs {
        public static int bulbs(ArrayList<Integer> a) {
        int count=0;
        boolean isstateChange=false;
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+"is state"+isstateChange+"count"+count+"\n");
            if((a.get(i)==0&&!isstateChange)||(isstateChange&&a.get(i)==1)){
                if(isstateChange){
                isstateChange=false;
                }
                else{
                isstateChange=true;
                }
                count++;
            }
            
        }
        System.out.print(count);
        return count;
    }
  public static void main(String args[]){
  ArrayList<Integer> list=new ArrayList();
  list.add(1);
  list.add(1);
  list.add(0);
  list.add(0);
  list.add(0);
  list.add(0);
  list.add(1);
  list.add(0);
  list.add(1);
  list.add(1);
  list.add(1);
  list.add(1);
  list.add(1);
  list.add(1);
  list.add(1);
  list.add(1);
  bulbs(list);
  }    
}
