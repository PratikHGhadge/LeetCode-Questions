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
    public List<Integer> rightSideView(TreeNode root) {
        Set<Integer> levels = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        helper(root, levels, ans, 0);
        return ans;
    }
    public void helper(TreeNode root, Set<Integer> levels, List<Integer> ans, Integer currentLevel){
        if(root==null) return;
        if(!levels.contains(currentLevel)){
            levels.add(currentLevel);
            ans.add(root.val);
        }
        helper(root.right, levels, ans, currentLevel+1);
        helper(root.left, levels, ans, currentLevel+1);
    }
}