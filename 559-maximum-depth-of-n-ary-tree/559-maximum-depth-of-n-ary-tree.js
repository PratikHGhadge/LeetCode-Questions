/**
 * // Definition for a Node.
 * function Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node|null} root
 * @return {number}
 */
var maxDepth = function(root) {
    if(root==null) return 0
    let max = 0
    for(let node of root.children){
        let tempMax = maxDepth(node)
        max = Math.max(max, tempMax)
    }
    return max+1
};