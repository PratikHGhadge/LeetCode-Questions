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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> mainQ = new ArrayDeque<TreeNode>();
        Queue<TreeNode> subQ = new ArrayDeque<TreeNode>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(root==null){
            return ans;
        }
        
        mainQ.offer(root);
        
        while(!mainQ.isEmpty()){
            TreeNode n = mainQ.poll();
            if(n.left!=null){
                subQ.offer(n.left);
            }
            if(n.right!=null){
                subQ.offer(n.right);
            }
            temp.add(n.val);
            if(mainQ.size()==0){
                mainQ = subQ;
                ans.add(temp);
                temp = new ArrayList<>();
                subQ = new LinkedList<>();
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}