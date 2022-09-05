/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        preorder1(root, ans);
        return ans;
    }
    
    public void preorder1(Node root, List<Integer> ans){
        ans.add(root.val);
        for(Node ch : root.children){
            preorder1(ch, ans);
        }
    }
}