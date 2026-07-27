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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null){
            return root == subRoot;
        }

        if(root.val == subRoot.val && sameTree(root,subRoot)){
            return true;
        }

        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

        
        
        
    }

    public boolean sameTree(TreeNode root,TreeNode subRoot){

        if(root == null || subRoot == null){
            return root==subRoot;
        }

        boolean left = sameTree(root.left,subRoot.left);
        boolean right = sameTree(root.right,subRoot.right);

        return left && right && root.val == subRoot.val;
    }

}
