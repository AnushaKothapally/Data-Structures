/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Anusha
 */
public class TreeLevelOrder {
     private class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
    }

    public void preorder(TreeNode root){
        if(root==null)
            return;
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }
    public void levelorder(TreeNode root){
        Queue q=new PriorityQueue();
        q.add(root);
        while(q!=null){
            q.add(root.left);
            q.add(root.right);
            System.out.print(q.remove()+"\t");
        }
    }
    
}
