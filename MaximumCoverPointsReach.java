/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

/**
 *
 * @author Anusha
 */
public class MaximumCoverPointsReach {
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
       int result=0;
        for(int i=1;i<X.size();i++){
            result+= Math.abs(X.get(i)-X.get(i-1))<Math.abs(Y.get(i)-Y.get(i-1))?Math.abs(Y.get(i)-Y.get(i-1)):Math.abs(X.get(i)-Y.get(i-1));
            System.out.println(result);
        }
        return result;
    }
    public static void main(String args[]){
        ArrayList<Integer> x= new ArrayList();
        ArrayList<Integer> y= new ArrayList();
        //x.add(2);
        x.add(7);
        x.add(13);
       // y.add(2);
        y.add(1);
        y.add(5);
        coverPoints(x,y);
        
        Set st= new HashSet();
        
    }
}
