/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author srishailamdasari1
 */
public class FizzBuzz {
    
    void fizreplace(int x){
        for(int i=1;i<=x;i++){
        int sum=0;
        int temp=i;
    /*    while(i>0){
        int d=i%10;    
        i= i/10;
        sum+=d;
        }
        boolean isfive=false;
        i=temp;
        if(i%10==0||i%10==5){
        isfive=true;
        }
        if(sum%3==0&&isfive==true){
        System.out.println("FizzBuzz");
        }
        else if(sum%3==0){
        System.out.println("Fizz");
        }
        else if(isfive){
        System.out.println("Buzz");
        }
        else{
        System.out.println(i);
        }*/
        if(i%3==0&&i%5==0){
            System.out.println("FizzBuzz");
        }
        else if(i%3==0){
        System.out.println("Fizz");
        }
        else if(i%5==0){
        
        System.out.println("Buzz");
        }
        else{
        System.out.println(i);
        }
        }
    }
    public static void main(String args[]){
    FizzBuzz fb= new FizzBuzz();
        fb.fizreplace(20);
    }
}
