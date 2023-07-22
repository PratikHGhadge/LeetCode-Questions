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
 * @return {number}
 */
var sumNumbers = function(root) {
    let ans = [0];
    helper(root, root.val, ans);
    return ans[0];
};


var helper = function(root,  num, ans){
        if(root.left==null && root.right==null){
            ans[0] +=num;
        }
        if(root.left!=null) helper(root.left, num*10+root.left.val, ans);
        if(root.right!=null) helper(root.right, num*10+root.right.val, ans);
    }