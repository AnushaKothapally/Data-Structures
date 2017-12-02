package fb.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anusha
 */
//Binary Search Tree
public class SimpleTree {
    private class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
    }
    static void insert(TreeNode root,int value){
        while(root!=null&&(root.left!=null&&root.right!=null)){
        if(root.value>=value){
            root=root.left;
        }else{
        
        }
        }
    }
     public TreeNode construct(List<Integer> values,int start,int end){
            if(start<end)
                return null;
            int mid=(start+end)/2;
            TreeNode n= new TreeNode();
            n.value=values.get(mid);
            n.left=construct(values,start,mid-1);
            n.right=construct(values,mid+1,end);
            
          return n;  
    }
    public boolean isSubTree(TreeNode r1,TreeNode r2){
        if(r2==null)
            return true;
        if(r1==null)
            return false;
        if(isIdentical(r1,r2)){
        return true;
        }
        return isSubTree(r1.left, r2)|| isSubTree(r1.right, r2);
    }
    public boolean isIdentical(TreeNode r1, TreeNode r2){
        Vector<Integer> v=new Vector();
        
        if(r1==null&&r2==null){
            return true;
        }
        if(r1==null||r2==null)
            return false;
        
        return (r1.value==r2.value && 
                isIdentical(r1.left, r2.left)&&isIdentical(r1.right, r2.right));
    }
    static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        while(true){
            int size=queue.size();
            if(size==0){
                break;
            }
            while(size>0){
                TreeNode visited=queue.poll();
                System.out.println(visited.value+" ");
                if(visited.left!=null){
                queue.add(visited.left);
                }
                if(visited.right!=null){
                queue.add(visited.right);
                }
                size--;
            }
            System.out.println();
        }
    }
     TreeNode covertBSTtoInorder(TreeNode root, TreeNode head,TreeNode lastNode){
        if(root==null){
            return null;
        }
        covertBSTtoInorder(root.left, head,lastNode);
        TreeNode n=new TreeNode();
        n.value=root.value;
        if(head==null){
            head=n;
            head.right=null;
            lastNode=n;
        }else{
           lastNode=n;
          // n.left=null;
           n.left=lastNode;
           lastNode.right=n;
        }
       
        covertBSTtoInorder(root.right, head,lastNode);
        return head;
    }
    static void inOrderwithStack(TreeNode root){
        Stack<TreeNode> stack=new Stack();
        while(root!=null){
        stack.push(root);
        root=root.left;
        }
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            System.out.print(node.value);
            TreeNode right=null;
            if(node.right!=null){
                //stack.push(node.right);
                right=node.right;
            }
            while(right!=null){
                stack.push(right);
                right=right.left;
            }
        }
    }
    static void iterativePreorder(TreeNode root){
        Stack<TreeNode> stack=new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode n1=stack.pop();
            System.out.println(n1.value);
            if(n1.right!=null){
                stack.push(n1.right);
            }
            if(n1.left!=null){
                stack.push(n1.left);
            }        
        }
    
    }
    /*
            7
          /   \
         4     9
        / \   / \
       1   5 8  10
    
    1,5,4,8,10,9,7  Left Right Root
    Root  Right Left
    7,9,10, 8,4,5,1
    
    */
    
    static void LCA(TreeNode root,TreeNode n1, TreeNode n2){    
            //
    }
   
    static void interativePostorderwithTwoStacks(TreeNode root){
        Stack<TreeNode> s1=new Stack();
        Stack<TreeNode> s2=new Stack();
        while(root!=null){
            s1.push(root);
            root=root.right;  
        }
        while(!s1.isEmpty()){
            TreeNode n1=s1.pop();
            s2.push(n1);
            TreeNode left=null;
            if(n1.left!=null){
                left=n1.left;
                s1.push(n1.left);            
            }
            while(left!=null){
                s1.push(left);           
            }           
        }
        
        //reverse s2;
    }
    public static void main(String args[]){
        
    }
}
