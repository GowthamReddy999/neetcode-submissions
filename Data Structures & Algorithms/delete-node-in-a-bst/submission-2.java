/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){
            return root;
        }

        if(root.val > key){
            root.left = deleteNode(root.left,key);

        }
        else if(root.val < key){
            root.right = deleteNode(root.right,key);
            
        }
        else {
            if(root.left == null && root.right == null){  // zero child
                return null;
            }
            if(root.left == null){ // for one child
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            int inorder = inordersucceor(root.right); // for two childrens

            root.val = inorder;
           root.right = deleteNode(root.right,inorder);

        }
        return root;
    }
    public int inordersucceor(TreeNode root){

        int ans = root.val;
        while(root != null){

            ans = root.val;
            root = root.left;

           
        }
        return ans;
    }
}