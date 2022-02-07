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
    static void helper(HashMap<Integer, List<Integer>> map, TreeNode root, int level){
        if(root == null) return;
        List<Integer> tmp = map.getOrDefault(level, new ArrayList<>());
        tmp.add(root.val);
        map.put(level, tmp);
        helper(map, root.left, level + 1);
        helper(map, root.right, level + 1);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        helper(map, root, 0);
        int level = 0;
        while(map.containsKey(level)) list.add(map.get(level++));
        return list;
    }
}