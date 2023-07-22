/**
 * // Definition for a Node.
 * function Node(val, children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node|null} root
 * @return {number[]}
 */
var preorder = function(root) {
    let ans = [];
    helper(root, ans)
    return ans
};

var helper = function(root, ans){
    if(root==null) return 
    ans.push(root.val)
    for(node of root.children){
        helper(node, ans)
    }
}