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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }
    
    public static void helper(TreeNode root, ArrayList<String> ans, String currentPath){
        if(root == null) return;
        if(root.left==null && root.right == null){
            ans.add(currentPath+root.val);
            return;
        }
        currentPath+=root.val+"->";
        helper(root.left, ans, currentPath);
        helper(root.right, ans, currentPath);
    }
}