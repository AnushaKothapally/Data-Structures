package fb.trees;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anusha
 * 10,15,20,17,18,19,20,21
 *          10
 *         /  \
 *        15   20
 *       /  \
 *      17
 * 10, ^ 
 */
public class MinHeap {
    
    int capacity;
    int heapSize=0;
    int arr[];

    public MinHeap(int capacity) {
        this.capacity=capacity;
        arr=new int[capacity];
    }
    
    int getLeftchildIndex(int parentIndex){
        return parentIndex*2+1<=heapSize?parentIndex*2+1:-1;
    }
    int getRightchildIndex(int parentIndex){
        return parentIndex*2+2<=heapSize?parentIndex*2+2:-1;
    }
    int getParentIndex(int childIndex){
      return  (childIndex-1)/2; 
    }
    boolean hasParent(int index){
        if(index==0)
            return false;
        else
        return true;
    }
    boolean hasLeftchild(int parentIndex){
        return parentIndex*2+1<=heapSize;
    }
   boolean hasRightchild(int parentIndex){
    return parentIndex*2+2<=heapSize;
    }
    public void insertIntoheap(int data){
      if(heapSize==capacity-1){
          try {
              throw new Exception();
          } catch (java.lang.Exception ex) {
              Logger.getLogger(MinHeap.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
     // System.out.println(heapSize);
      arr[heapSize]=data;
      heapifyUp(heapSize);
     // maxHeapifyDown(heapSize);
      heapSize++;
      
    }
    public void deleteMinFromheap(){
        //System.out.println("?"+heapSize);
        arr[0]=arr[heapSize-1];
        heapSize--;
        heapifyDown();
    }
    public void heapifyUp(int index){
        //System.out.println(hasParent(index)+"\t"+arr[index]+"\t"+arr[getParentIndex(index)]);
        while(hasParent(index)&&arr[getParentIndex(index)]>arr[index]){
            swap( getParentIndex(index),index);
            index=  getParentIndex(index);
        }
    }
    public void heapifyDown(){
        int index=0;
        int minChildIndex=-1;
        while(hasLeftchild(index)){
        if(arr[index]>arr[getLeftchildIndex(index)]){
        if(hasRightchild(index)&&arr[getRightchildIndex(index)]<arr[getLeftchildIndex(index)]){
            minChildIndex=getRightchildIndex(index);
        }
        else{
            minChildIndex=getLeftchildIndex(index);
        }
               // System.out.println(minChildIndex+"\t"+index+"\t"+arr[index]+"\t"+arr[getLeftchildIndex(index)]+"\t"+arr[getRightchildIndex(index)]);

        }else{
            break;
        }
//        System.out.println(minChildIndex+"\t"+index+"\t"+arr[index]+"\t"+arr[getLeftchildIndex(index)]+"\t"+arr[getRightchildIndex(index)]);
                
        swap(index,minChildIndex);
        index=minChildIndex;
        }
        
    }
    public void swap(int parentIndex,int index){
        //System.out.println(index);
                
        int temp=arr[index];
        arr[index]=arr[parentIndex];
        arr[parentIndex]=temp;
        
    }
    public int getMin(){
        return arr[0];
    }
    public int getMax(){
        return arr[heapSize-1];
    }
    public static void main(String args[]){
        MinHeap p= new MinHeap(10);
       // p.capacity=10;
        p.insertIntoheap(6);
        p.insertIntoheap(5);
        p.insertIntoheap(2);
        p.insertIntoheap(4);
        p.insertIntoheap(3);
                
        System.out.println("\t"+p.getMin());
        p.deleteMinFromheap();
        System.out.println("\t"+p.getMin());
        
    }

    private Exception Exception() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    public void maxgetLeftChild(){
        
    }
}
