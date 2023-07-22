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
var postorderTraversal = function(root) {
    let ans = [];
    helper(root, ans)
    return ans
};

var helper = function(root, ans){
    if(root==null) return
    helper(root.left, ans)
    helper(root.right, ans)
    ans.push(root.val)
}