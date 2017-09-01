/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author Anusha K
 */
public class Mergesort {
    void sort(int[] arr,int start, int end){
        
        if(start<end){
            int mid=(start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            //System.out.println("one");
            merge(arr,start,mid,end);
            
        }    
        //return arr;
    }
    void merge(int[] arr,int start,int mid,int end){
       int L[]=new int[mid-start+1];
       int R[]=new int[end-mid];
       for(int i=0;i<L.length;i++){
       L[i]=arr[start+i];
       }
       for(int j=0;j<R.length;j++){
       R[j]=arr[mid+j+1];
       }
       int i=0,j=0;
       int k=start;
       
       while(L.length>i||R.length>j){
       if(L.length>i&&R.length>j){
           //System.out.println(R[j]+""+L[i]);
           if(L[i]>R[j]){
               
               arr[k]=R[j];
               j++;
              
           }
           else{
             arr[k]=L[i];
               i++;

           }
         
       }else if(L.length>i){
            arr[k]=L[i];
                 i++;
        }
       else if(R.length>j){
           arr[k]=R[j];
           j++;
       }
      k++;
       
       }
       
    }
  
    public static void main(String args[]){
        Mergesort m=new Mergesort();
        int[] arr=new int[]{4,2,3,0,1,6,15,9,7,13};
        m.sort(arr, 0, arr.length-1);
        
        for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" , ");
     }
       
}
