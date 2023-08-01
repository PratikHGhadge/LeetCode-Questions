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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        TreeNode ans = dummy;
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        for(int i : list){
            dummy.right = new TreeNode(i);
            dummy=dummy.right;
        }
        return ans.right;
    } 
    
    public void helper(TreeNode root, List<Integer> inorderList){
        if(root==null){ return;}
        helper(root.left, inorderList);
        inorderList.add(root.val);
        helper(root.right, inorderList);
    }
}