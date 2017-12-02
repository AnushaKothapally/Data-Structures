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
    
    //Least common ancestor for BST
    static Node1 lca(Node1 root,int v1,int v2)
    {
         if(root==null){
            return null;
        }
        else if(root.data>v1&& root.data> v2)
        {
           root=root.left;
            return lca(root,v1,v2);
        }
         else if(root.data<v1&& root.data< v2){
           root=root.right; 
             return lca(root,v1,v2); 
        }
        
        return root;
    }

    

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
        System.out.println(left+"\t"+right+"\t" +root.data);
       return Math.max(left,right)+1;
    }
    /* nodes appear when seen from top*/
     void topView(Node1 root) {
      
       while(root!=null){
           System.out.print(root.data+" ");
           root=root.right;
       }

}
     
     public static void main(String args[]){
         Node1 n=new Node1();
         n.data=4;
         Node1 n1=new Node1();
         Node1 n2=new Node1();
         n1.data=2;
         n2.data=3;
          Node1 n3=new Node1();
         Node1 n4=new Node1();
         n1.data=5;
         n2.data=6;
         n.left=n1;
         n.right=n2;
         n1.left=n3;
         n1.right=n4;
         System.out.println(height(n));
         
         
     }
}

class Node1 {

    int data;
    Node1 left;
    Node1 right;
}
