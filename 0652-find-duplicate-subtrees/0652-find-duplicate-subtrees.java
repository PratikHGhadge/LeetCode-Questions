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
    HashMap<String, Integer> map = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
    
    public String dfs(TreeNode root, List<TreeNode> ans){
        String s1 = "";
        String s2 = "";
        String curr = ""+root.val;
        if(root.left!=null){
            s1 = dfs(root.left, ans);
        }
        if(root.right!=null){
            s2 = dfs(root.right, ans);
        }
        String str = curr+"l"+s1+"r"+s2;
        map.put(str, map.getOrDefault(str, 0)+1);
        if(map.get(str)==2){
            ans.add(root);
        }
        return str;
    }
}