/**
 * // Definition for a Node.
 * function Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node|null} root
 * @return {number[]}
 */
var postorder = function(root) {
    let ans = []
    helper(root, ans)
    return ans
};

var helper = function(root, ans){
    if(root == null) return
    for(node of root.children){
        helper(node, ans)
    }
    ans.push(root.val)
}