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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<list.size(); i++){
            min = Math.min((list.get(i) - list.get(i-1)), min);
        }
        return min;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root!=null){
            list.add(root.val);
            helper(root.left, list);
            helper(root.right, list);
        }
    }
}