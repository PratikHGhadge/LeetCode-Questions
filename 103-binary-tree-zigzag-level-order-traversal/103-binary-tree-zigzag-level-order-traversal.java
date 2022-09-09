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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Stack<TreeNode> mq = new Stack<>();
        if(root == null) return ans;
        mq.push(root);
        Stack<TreeNode> cq = new Stack<>();
        int level = 1;
        while(mq.size()>0){
            root = mq.pop();
            temp.add(root.val);
            if(level%2==0){
                if(root.right!=null){
                    cq.push(root.right);
                }
                if(root.left!=null){
                    cq.push(root.left);
                }
            }else{
                if(root.left!=null){
                    cq.push(root.left);
                }
                if(root.right!=null){
                    cq.push(root.right);
                }
            }
            if(mq.size()==0){
                mq = cq;
                cq = new Stack<>();
                ans.add(temp);
                temp = new ArrayList<>();
                level++;
            }
        }
        return ans;
    }
}