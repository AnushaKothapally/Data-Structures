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
public class BinaryTree {

    void preOrder(Node1 root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node1 root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    void inOrder(Node1 root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }
    static int height(Node1 root) {
      	// Write your code here.
        if(root==null)
            return -1;
        int left= height(root.left);
        int right=height(root.right);
        System.out.println(left+"\t"+right);
       return Math.max(left,right)+1;
    }
    /* nodes appear when seen from top*/
     void topView(Node1 root) {
      
       while(root!=null){
           System.out.print(root.data+" ");
           root=root.right;
       }

}
}

class Node1 {

    int data;
    Node1 left;
    Node1 right;
}
