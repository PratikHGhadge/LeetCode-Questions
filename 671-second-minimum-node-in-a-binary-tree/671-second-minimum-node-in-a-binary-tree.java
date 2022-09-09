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
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> list = new TreeSet<>();
        helper(root, list);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.addAll(list);
        if(ans.size()<2){
            return -1;
        }
        return ans.get(1);
    }
    public void helper(TreeNode root, Set<Integer> list){
        if(root!=null){
            list.add(root.val);
            helper(root.left, list);
            helper(root.right, list);
        }
    }
}