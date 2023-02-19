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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> mainQ = new ArrayDeque<TreeNode>();
        Queue<TreeNode> subQ = new ArrayDeque<TreeNode>();
        mainQ.offer(root);
        boolean flag = true;
        int val = Integer.MIN_VALUE;
        while(!mainQ.isEmpty()){
            TreeNode n = mainQ.poll();
            if(n.left!=null){
                subQ.offer(n.left);
            }
            if(n.right!=null){
                subQ.offer(n.right);
            }
            if((flag==true && val>=n.val) || (flag==true && (n.val%2==0))){
                return false;
            }
            if((flag==false && val<=n.val) || (flag==false && (n.val%2!=0))){
                return false;
            }
            val = n.val;
            if(mainQ.size()==0){
                mainQ = subQ;  
                if(flag){
                    val = Integer.MAX_VALUE;
                    flag = false;
                }else{
                    val = Integer.MIN_VALUE;
                    flag = true;
                }
                subQ = new LinkedList<>();
            }
        }
        return true;
    }
}