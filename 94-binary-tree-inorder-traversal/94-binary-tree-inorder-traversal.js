/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    let ans = [];
    helper(root, ans)
    return ans
};

var helper = function(root, ans){
    if(root==null) return
    helper(root.left, ans)
    ans.push(root.val)
    helper(root.right, ans)
}