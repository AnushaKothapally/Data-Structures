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
public class NumberstoWords {
    String units[]=new String[]{"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","ten","eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen","Twenty"};
    String tens[]=new String[]{"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
    String hundred[]=new String[]{"hundred","Thousand"};
    void printwords(int num){
        String word=null;
        //num=num/10;
             int unit=num%10;
             int ten=num%100;
             if(ten<20){
                 System.out.println();
                 //String st=units[0];
                 word=word+""+units[ten];
             }
             else{
                 ten=(num/10)%10;
                 word=tens[ten]+""+word;
             }
             
             int hundred=num%1000;
             
                

        if(num/100>0){
        
        }
    
    }
    
}
