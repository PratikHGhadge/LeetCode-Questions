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
 * @return {string[]}
 */
var binaryTreePaths = function(root) {
    let ans = [];
    helper(root, ans, "");
    return ans;
};


var helper = function(root, ans, currentPath){
        if(root == null) return;
        if(root.left==null && root.right == null){
            ans.push(currentPath+root.val);
            return;
        }
        currentPath+=root.val+"->";
        helper(root.left, ans, currentPath);
        helper(root.right, ans, currentPath);
}