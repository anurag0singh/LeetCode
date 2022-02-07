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
    static int helper(TreeNode root, int level){
        if(root == null) return level - 1;
        return(Math.max(helper(root.left, level + 1), helper(root.right, level + 1)));
    }
    
    public int maxDepth(TreeNode root) {
        return helper(root, 1);
    }
}