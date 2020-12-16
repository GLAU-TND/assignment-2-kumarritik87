/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root;
    public MyBinarySearchTree(){
        root = null;

    }
    public void InOrderTraversal(TreeNode troot){
        if(troot!=null){
            InOrderTraversal(troot.left);
            System.out.println(" "+troot.data);
            InOrderTraversal(troot.right);
        }
    }
}
