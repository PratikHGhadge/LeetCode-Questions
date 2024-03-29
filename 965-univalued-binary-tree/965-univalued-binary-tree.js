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
 * @return {boolean}
 */
var isUnivalTree = function(root) {
    let value = root.val;
    return helper(root, value);
};

var helper = function(root, value){
        if(root == null) return true;
        if(root.val != value) return false;
        return helper(root.left, value) && helper(root.right, value);
    }