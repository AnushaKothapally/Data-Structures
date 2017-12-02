/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author srishailamdasari1
 */
public class MatrixRotation {
    static void rotatematrix(int ar[][],int M, int N, int q){
        int m=M;
        int n=N;
        int temp[]=new int[m*n];
        int s=0,p=0;
        int tid=0;
        int start=0,end=0;
        while(s<m&&p<n){
         end=start;
        System.out.println("layer"+"s"+n);
        for(int i=s;i<n;i++){
            temp[tid]=ar[s][i];
            // System.out.println(temp[tid]+""+s+"");
             tid++;
             end++;
             
        }
        s++;
        for(int k=s;k<m;++k){
            temp[tid]=ar[k][n-1];
            //System.out.println(temp[tid]);
            tid++;
            end++;
        }
        n--;
        if(s<m){
        for(int j=n-1;j>=p;--j){
            
           temp[tid]=ar[m-1][j];
          // System.out.println("cc"+temp[tid]+"m"+(m-1)+"j"+j);
           tid++;
           end++;
             
        }
        m--;
        }
        if(p<n){
        for(int l=m-1;l>=s;--l){
        temp[tid]=ar[l][p];
       // System.out.println(temp[tid]);
         tid++;
         end++;
        }
        p++;
        }

        
        if(end-start>q){
            rotate(temp,start,start+q-1);
            rotate(temp,start+q,end-1);
            rotate(temp,start,end-1);
        
        }
        
        start=end;
        
        for(int i=0;i<temp.length;i++){
       // System.out.print(temp[i]);
        }
        //break;
        } 
        fillmatrix(temp,ar,M,N);
    }
    static void fillmatrix(int temp[],int mat[][], int m, int n){
      int k = 0, l = 0;
 
    /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index  */
    int tIdx  = 0;  // Index in temp array
    while (k < m && l < n)
    {
        /* first row from the remaining rows */
        for (int i = l; i < n; ++i)
            mat[k][i] = temp[tIdx++];
        k++;
 
        /* last column from the remaining columns */
        for (int i = k; i < m; ++i)
            mat[i][n-1] = temp[tIdx++];
        n--;
 
        /* last row from the remaining rows */
        if (k < m)
        {
            for (int i = n-1; i >= l; --i)
                mat[m-1][i] = temp[tIdx++];
            m--;
        }
 
        /* first column from the remaining columns */
        if (l < n)
        {
            for (int i = m-1; i >= k; --i)
                mat[i][l] = temp[tIdx++];
            l++;
        }
    }    
    }
    public static void  rotate(int temp[], int st,int e){
      //  System.out.println("one");
        while(st<e){
         //  System.out.println("****"+temp[st]+"\t"+temp[e]+"\t"+e+"s"+st);
            int t=temp[st];
            temp[st]=temp[e];
            temp[e]=t;
            st++;
            e--;
        }
           }
    
    public static void main(String args[]){
        int ar[][]=new int[][]{{1,2,3,4},{7, 8, 9, 10},{13,14,15,16},{19,20,21,22},{25,26,27,28}};
        print(ar);
        rotatematrix(ar,5,4,1);
        print(ar);
         

    }
    static void print(int ar[][]){
    for(int i=0;i<5;i++){
         for(int j=0;j<4;j++){
         System.out.print(ar[i][j]+" ");
         }
         System.out.println();
         }
    }
}
