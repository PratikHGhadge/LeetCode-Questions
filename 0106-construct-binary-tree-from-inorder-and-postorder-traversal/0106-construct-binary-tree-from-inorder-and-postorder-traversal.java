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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i : inorder) {
            map.put(i, index);
            index++;
        }
        map.forEach((key, val) -> System.out.println(key + "-->" + val));
        int[] pos = new int[1];
        pos[0] = postorder.length-1;
        return constructTree(postorder, map, 0, inorder.length - 1, pos);
    }
    public TreeNode constructTree(int[] postorder, Map<Integer, Integer> map, int inStart, int inEnd, int[] posInd) {
        if (inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[posInd[0]]);
        int currentInd = map.get(root.val);
        posInd[0]--;
        root.right = constructTree(postorder, map, currentInd + 1, inEnd, posInd);
        root.left = constructTree(postorder, map, inStart, currentInd - 1, posInd);
        return root;
    }
}