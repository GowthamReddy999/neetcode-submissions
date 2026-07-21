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
    public TreeNode invertTree(TreeNode root) {


        if(root == null){
            return root;
        }

    Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode node;
        while(!q.isEmpty()){

            int n = q.size();
            for(int i=0;i<n;i++){

                node = q.poll();
                
                    TreeNode temp1 = node.left;
                    TreeNode temp2 = node.right;

                    node.left = temp2;
                    node.right = temp1;

                    if(node.left != null){
                        q.add(node.left);
                    }
                     if(node.right != null){
                        q.add(node.right);
                    }

            }
        }
        return root;

        

        
    }
}
