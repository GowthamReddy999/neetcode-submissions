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
    public int kthSmallest(TreeNode root, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<TreeNode> p = new LinkedList<>();

        if(root == null){
            return -1;
        }
        
        p.add(root);

        while(!p.isEmpty()){

            int n = p.size();
            for(int i=0;i<n;i++){
                TreeNode node = p.poll();
                pq.add(node.val);

                if(node.left != null){
                    p.add(node.left);


                }
                if(node.right != null){
                    p.add(node.right);
                }
            }
        }
        //  for (int i = 1; i < k; i++) {
        //     pq.poll();
        // }

        while(k > 1) {
            pq.poll();
            k--;
        }

        return pq.peek();
    }
}
