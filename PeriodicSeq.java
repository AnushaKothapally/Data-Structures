/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Anusha
 */
public class PeriodicSeq {
    int periodicSequence(int s0, int a, int b, int m) {
    
    int p[]=new int[m];
    
    for(int i=0;i<m;i++){
        p[i]=-1;
    }
    p[s0]=0;
    int current=s0;
    for(int k=1;k<=m;k++){
        current=(a*current+b)%m;
        if(p[current]!=-1)
            return k-p[current];
        p[current]=k;
    } 
    return 0;
}

    
}
