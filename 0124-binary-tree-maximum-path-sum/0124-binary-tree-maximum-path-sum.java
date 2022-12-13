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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return ans;
    }
    
    public int solve(TreeNode root) { 
        if(root==null){
            return 0;
        }
        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));
        int curr = root.val;
        int sum = left+right+curr;
        ans = Math.max(ans,sum);
        return curr + Math.max(left, right);
    }
    
}






