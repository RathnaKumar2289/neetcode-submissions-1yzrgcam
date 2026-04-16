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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;

        return dfs(root,0);
    }

    int dfs(TreeNode node,int depth){
        if(node==null){
            return depth;
        }

        int leftdepth = dfs(node.left,depth+1);
        int rightDepth = dfs(node.right,depth+1);
        return Math.max(leftdepth,rightDepth);
    }
}
