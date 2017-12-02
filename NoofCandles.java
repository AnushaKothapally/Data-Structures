/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Anusha
 * Colleen is turning  years old! Therefore, she has  candles of various heights on her cake, and candle  has height hi . Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

Given the  for each individual candle, find and print the number of candles she can successfully blow out.

Input Format

The first line contains a single integer, , denoting the number of candles on the cake. 
The second line contains  space-separated integers, where each integer  describes the height of candle .


 */
public class NoofCandles {
       static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int highest=0;
        int count=0;
        for(int i=0;i<n;i++){
           if(highest<ar[i]){
              highest=ar[i]; 
           }
        }
        for(int i=0;i<n;i++){
            if(ar[i]==highest){
                count++;
            }
        }
        return count;
        
    }
 
}
