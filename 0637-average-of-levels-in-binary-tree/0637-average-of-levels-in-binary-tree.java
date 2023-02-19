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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> mainQ = new LinkedList<>();
        Queue<TreeNode> subQ = new LinkedList<>();
        double temp = 0;
        double count = 0;
        mainQ.add(root);
        while(!mainQ.isEmpty()){
            TreeNode n = mainQ.poll();
            if(n.left!=null){
                subQ.add(n.left);
            }
            if(n.right != null){
                subQ.add(n.right);
            }
            temp += n.val;
            count++;
            if(mainQ.size()==0){
                mainQ = subQ;
                subQ = new LinkedList<>();
                double avg = (double)temp/(double)count;
                temp = 0;
                count = 0;
                ans.add(avg);
            }
        }
        return ans;
    }
}