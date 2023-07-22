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
    public int sumNumbers(TreeNode root) {
        int[] ans = new int[1];
        helper(root, root.val, ans);
        return ans[0];
    }
    
    public static void helper(TreeNode root, int num, int[] ans){
        if(root.left==null && root.right==null){
            ans[0] +=num;
            // System.out.println(num);
        }
        if(root.left!=null) helper(root.left, num*10+root.left.val, ans);
        if(root.right!=null) helper(root.right, num*10+root.right.val, ans);
    }
}