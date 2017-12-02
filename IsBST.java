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
public class IsBST {
    private class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
    }
    public boolean isBinarySearchTree(TreeNode root,int min,int max){
        if(root==null) return true;
        if(root.value<min||root.value>max){
        return false;
        }
        return isBinarySearchTree(root.left, min, root.value) && isBinarySearchTree(root, root.value+1, max);
    }
    
}
