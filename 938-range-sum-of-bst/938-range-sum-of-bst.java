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
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, list);
        int ans = 0;
        for(int i : list){
            if(i>=low && i<=high){
                ans+=i;
            }
        }
        return ans;
    }
    
    public static void helper(TreeNode root, ArrayList<Integer> list){
        if(root==null) return;
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }
}