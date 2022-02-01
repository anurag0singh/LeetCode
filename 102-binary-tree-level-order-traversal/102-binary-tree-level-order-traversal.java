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
    static void helper(TreeNode root, Map<Integer,List<Integer>> map, int level){
        if(root == null) return;
        if(map.containsKey(level)){
            List<Integer> tmp = map.get(level);
            tmp.add(root.val);
            map.put(level, tmp);
        }
        else{
            List<Integer> tmp = new ArrayList<>();
            tmp.add(root.val);
            map.put(level, tmp);
        }
        helper(root.left, map, level + 1);
        helper(root.right, map, level + 1);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        helper(root, map, 0);
        int level = 0;
        while(map.containsKey(level)) list.add(map.get(level++));
        return list;
    }
}