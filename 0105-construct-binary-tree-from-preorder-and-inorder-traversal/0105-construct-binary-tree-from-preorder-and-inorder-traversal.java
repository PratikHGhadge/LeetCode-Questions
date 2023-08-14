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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i : inorder){
            map.put(i, index);
            index++;
        }
        int[] pre = new int[1];
        pre[0] = 0;
        map.forEach((key, val)->{System.out.println(key+"-->"+val);});
        return constructTree(preorder, map, 0, inorder.length-1, pre);
    }
    public TreeNode constructTree(int[] preorder, Map<Integer, Integer> map, int inStart, int inEnd, int[] preInd){
        
        if(inStart>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preInd[0]]);
        int currentInd = map.get(preorder[preInd[0]]);
        preInd[0]++;
        root.left = constructTree(preorder, map,  inStart,  currentInd-1, preInd);
        root.right = constructTree(preorder, map, currentInd+1, inEnd,  preInd);
        return root;
    }
}