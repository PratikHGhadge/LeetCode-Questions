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
    public int sumOfLeftLeaves(TreeNode root) {
        int[] leftSum = new int[1];
        helper(root, leftSum);
        return leftSum[0];
    }
    public void helper(TreeNode root, int[] leftSum){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null) leftSum[0] += root.left.val;
        helper(root.left, leftSum);
        helper(root.right, leftSum);
    }
}