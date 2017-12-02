/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb.trees;

/**
 *
 * @author Anusha
 * 
 *          1111
 *        0112
 *         121 
 */
public class NoofwaysStringDecoding {
    
    static int decodingways(String st){
        int n=st.length();
       // System.out.println(st);
        int arr[]= new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=0;
            if(st.charAt(i-1)>'0'){  
               arr[i]=arr[i-1];
            }
            if(st.charAt(i-2) == '1' || (st.charAt(i-2) == '2' && st.charAt(i-1) < '7')){
               // System.out.println("hi"+arr[i-1]+"\t"+arr[i-2]);
                arr[i]+=arr[i-2];
            }
        }
       // System.out.println(arr[2]);
        return arr[n];
    }
    static int countDecodingDP(char[] digits)
{
    int n=digits.length;
    int count[]=new int[n+1]; // A table to store results of subproblems
    count[0] = 1;
    count[1] = 1;
 
    for (int i = 2; i <= n; i++)
    {
        count[i] = 0;
 
        // If the last digit is not 0, then last digit must add to
        // the number of words
        if (digits[i-1] > '0')
            count[i] = count[i-1];
 
        // If second last digit is smaller than 2 and last digit is
        // smaller than 7, then last two digits form a valid character
        if (digits[i-2] == '1' || (digits[i-2] == '2' && digits[i-1] < '7') )
            count[i] += count[i-2];
    }
    return count[n];
}
    public static void main(String args[]){
    
    String st="121";
    System.out.println(decodingways(st));
    System.out.println(countDecodingDP(st.toCharArray()));
    }
}
