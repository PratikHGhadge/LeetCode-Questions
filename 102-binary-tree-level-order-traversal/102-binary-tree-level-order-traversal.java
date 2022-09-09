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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Queue<TreeNode> mq = new ArrayDeque<>();
        if(root == null) return ans;
        mq.add(root);
        Queue<TreeNode> cq = new ArrayDeque<>();
        while(mq.size()>0){
            root = mq.remove();
             temp.add(root.val);
            if(root.left!=null){
                cq.add(root.left);
            }
            if(root.right!=null){
                cq.add(root.right);
            }
            if(mq.size()==0){
                mq = cq;
                cq = new ArrayDeque();
                ans.add(temp);
                temp = new ArrayList<>();
            }
        }
        return ans;
    }
}