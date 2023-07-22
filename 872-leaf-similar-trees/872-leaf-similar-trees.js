/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {boolean}
 */
var leafSimilar = function(root1, root2) {
    let l1 = []
    let l2 = []
    helper(root1, l1)
    helper(root2, l2)
    return JSON.stringify(l1)===JSON.stringify(l2);
};

var helper = function(root, list){
        if(root == null) return;
        if(root.left==null && root.right == null){
            list.push(root.val);
        }
        helper(root.left, list);
        helper(root.right, list);
    }















