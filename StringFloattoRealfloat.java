/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb.trees;

/**
 *
 * @author Anusha
 */
public class StringFloattoRealfloat {
    static void covertoFloat(String st){
        int i=0;
        float result=0.0F;
        int dotpos=0;
        String power="";
        while(i<st.length()){
            if(st.charAt(i)=='E'){
              power=st.substring(i+1);
              break;
            }
            else if(st.charAt(i)!='.'){
                result=result*10+st.charAt(i)-'0';
            }
            else if(st.charAt(i)=='.'){
                String sub[]=st.split("E");
                
                dotpos=sub[0].length()-i-1;
                //System.out.println(dotpos+"\t"+sub[0]);
            }
           
            i++;
        }
        
        result/=(Math.pow(10, dotpos));
        System.out.println(result);
        //int po=Integer.parseInt(power);
        //System.out.println(Math.pow(10, po)+"\t"+2*result);
        //i//nt num=po;
        int l;
       boolean isminus=power.charAt(0)=='-'?true:false;
       l=isminus?Integer.parseInt(power.substring(1)):Integer.parseInt(power);
       System.out.println(l);
        while(l>0){
            if(isminus){
               result/=10; 
            }else{
                result*=10;
            }
            l--;
        }
        
        System.out.println(result);
    }
    public static void main(String args[]){
        String st="25.2E8";
        System.out.println(Float.valueOf(st));
        
        covertoFloat(st);
    }
    
}
