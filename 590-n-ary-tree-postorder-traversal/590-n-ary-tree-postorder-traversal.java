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
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        postorder1(root, ans);
        return ans;
    }
    
    public void postorder1(Node root, List<Integer> ans){
        for(Node ch : root.children){
            postorder1(ch, ans);
        }
        ans.add(root.val);
    }
}