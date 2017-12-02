/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fb;

/**
 *
 * @author Anusha
 */
public class InterleavingString {
   /*static boolean isInterleaving(String[] A, String[] B, String C[] ){
       int M=A.length;
       int N=B.length;
       boolean IL[][]=new boolean[M+1][N+1];
   
        for (int i=0; i<=M; ++i)
        {
        for (int j=0; j<=N; ++j)
        {
            // two empty strings have an empty string
            // as interleaving
            if (i==0 && j==0)
                IL[i][j] = true;
 
            // A is empty
            else if (i==0 && B[j-1]==C[j-1])
                IL[i][j] = IL[i][j-1];
 
            // B is empty
            else if (j==0 && A[i-1]==C[i-1])
                IL[i][j] = IL[i-1][j];
 
            // Current character of C matches with current character of A,
            // but doesn't match with current character of B
            else if(A[i-1]==C[i+j-1] && B[j-1]!=C[i+j-1])
                IL[i][j] = IL[i-1][j];
 
            // Current character of C matches with current character of B,
            // but doesn't match with current character of A
            else if (A[i-1]!=C[i+j-1] && B[j-1]==C[i+j-1])
                IL[i][j] = IL[i][j-1];
 
            // Current character of C matches with that of both A and B
            else if (A[i-1]==C[i+j-1] && B[j-1]==C[i+j-1])
                IL[i][j]=(IL[i-1][j] || IL[i][j-1]) ;
        }
    }
 
    return IL[M][N];
   } */
   public static int isInterleaving(String s1,String s2,String s3){
       
       StringBuilder s4=new StringBuilder(s2);
       s4.reverse();
       s1=s1+new String(s4);
       
       int st=0;
       int end=s1.length()-1;
    // System.out.println(s1+""+st+"\t"+end);
       for(int i=0;i<s3.length()&&st<=end;i++){
           if(s3.charAt(i)==s1.charAt(st)){
           st++;
           }
           else if(s3.charAt(i)==s1.charAt(end)){
               end--;
           }
           else{
              // System.out.println("hi"+s3.charAt(i));
               return 0;
           }
         // System.out.println("hi"+s3.charAt(i)); 
       }
       return 1;
   } 
   /*
   01234567 
   CWCDLAHI
   A[i] == C[i+j-1] then G[i][j] = G[i-1][j],
   B[j] == C[i+j-1] then G[i][j] = G[i][j-1]
       0  1 2 3 4
  N    0  C W A H
  0 0  T  T T F F
  1 C  T  T T F F
  2 D  F  F T F F  
  3 L  F  F T T T  
  4 I  F  F F F T
   */
   public static int checkInterleaving(String s1,String s2,String s3){
       	    if(s3.length()!=s1.length()+s2.length())
	        return 0;
        int arr[][]=new int[s1.length()+1][s2.length()+1];
       for(int i=0;i<=s1.length();i++){
          for(int j=0;j<=s2.length();j++){
             // System.out.println(i+"\t"+j);
              if(i==0&&j==0){
                  arr[i][j]=1;
              }
              else if(i==0&&s2.charAt(j-1)==s3.charAt(i+j-1)){
                  arr[i][j]=arr[i][j-1];
              }
              else if(i==0&&s2.charAt(j-1)!=s3.charAt(i+j-1)){
                  
              }
              else if(j==0&&s1.charAt(i-1)==s3.charAt(i+j-1)){
                  arr[i][j]=arr[i-1][j];
              }
              else if(j==0&&s1.charAt(i-1)!=s3.charAt(i+j-1)){
                  arr[i][j]=0;
              }
              else if(s1.charAt(i-1)==s3.charAt(i+j-1)&&s2.charAt(j-1)!=s3.charAt(i+j-1)){
                  arr[i][j]=arr[i-1][j];
              }
              else if(s1.charAt(i-1)!=s3.charAt(i+j-1)&&s2.charAt(j-1)==s3.charAt(i+j-1)){
                  arr[i][j]=arr[i][j-1];
              }
              else if(s1.charAt(i-1)==s3.charAt(i+j-1)&&s2.charAt(j-1)==s3.charAt(i+j-1)){
                 // System.out.println(i+"\t"+j);
                  arr[i][j]=arr[i-1][j]==1?arr[i-1][j]:arr[i][j-1];
              }
              else{
                  
              }
          
          }
       }
       return arr[s1.length()][s2.length()];
   }
   public static void main(String args[]){
       //String[] A=new String[]{"A","B"};
       //String[] B=new String[]{"C","D"};
       //String[] C=new String[]{"A","C","B","D"};
       System.out.println(checkInterleaving("ABC","DEF", "ACDBEF"));
   }
}
