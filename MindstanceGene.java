/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Anusha K
 */
public class MindstanceGene {
    public int minmutation(String start, String end, String[] bank){
    /* If both are equal*/
    if(start.equals(end)){
    return 0;
    }
    char sequence[]=new char[]{'A','C','T','G'};
    int mindistance=0;
    
    Set<String> bankset=new HashSet<>(Arrays.asList(bank));
    if(!bankset.contains(end)){
    return -1;
    }
        Set<String> visited = new HashSet<>();
        Queue <String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        while(!queue.isEmpty()){
        int queuesize=queue.size();
        while(queuesize-->0){
         String str=queue.poll();
         if(str==end){
         return mindistance;
         }
        char[] gene=str.toCharArray();
         for(int i=0;i<gene.length;i++){
            char temp=gene[i];
        for(char j:sequence){
            gene[i]=j;
            String nextgene=String.valueOf(gene);
            if(!visited.contains(nextgene)&&bankset.contains(nextgene)){
            visited.add(nextgene);
            queue.offer(nextgene);
            }
        }
        gene[i] = temp;

         }
         
        }
        mindistance++;
        }
        
        return -1;
    }
    
  public static void main(String args[]){
      MindstanceGene m=new MindstanceGene();
      String[] bank=new String[]{"ABD","ABG","BBG","AGB","BAG"};
      System.out.println(m.minmutation("ABG","BAG",bank));
  }  
  
}
