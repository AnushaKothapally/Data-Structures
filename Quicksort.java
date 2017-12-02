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
public class Quicksort {
   //consider pivot as last element.
            //arr[] = {90, 80, 30, 75, 40, 50, 70}
   // arr[] = {30, 40, 50, 70, 80, 90, 75}

    int partition(int arr[], int low,int high){
       int i=low-1; 
       int j=low;
       for(;j<=high-1;j++){
       if(arr[j]<=arr[high]){
           i++;
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
            }                   
       
    }
       int temp=arr[i+1];
           arr[i+1]=arr[high];
           arr[high]=temp;

        return i+1;
    }
    
    int partitionInto(int arr[],int low,int high){
        int i=low;
        int j=high-1;
        while(i<j){
            if(arr[i]<=arr[high]){
                i++;
            }
            else if(arr[j]>arr[high]){
                j--;
            }
            else{
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        int tmp=arr[j];
                arr[j]=arr[high];
                arr[high]=tmp;
       return j;
    }
    
    void quicksort(int arr[], int low,int high){
        if(low<high){
            int pivot=partitionInto(arr, low, high);
            System.out.println(pivot+"\t"+arr[pivot]+"\tlow"+low);
              quicksort(arr,low,pivot-1);
        quicksort(arr, pivot+1, high);
        }
       
        
    }
    
    public static void main(String args[]){
        int arr[]= new int[]{1,4,3,2,5,6};
        Quicksort q= new Quicksort();
        q.quicksort(arr, 0, arr.length-1);
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
    
    
}
