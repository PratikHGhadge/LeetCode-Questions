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
    public List<List<Integer>> levelOrder(Node root) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Queue<Node> mq = new ArrayDeque<>();
        if(root == null) return ans;
        mq.add(root);
        Queue<Node> cq = new ArrayDeque<>();
        while(mq.size()>0){
            root = mq.remove();
            temp.add(root.val);
            for(Node ch : root.children){
                cq.add(ch);
            }
            if(mq.size()==0){
                mq = cq;
                cq = new ArrayDeque();
                ans.add(temp);
                temp = new ArrayList<>();
            }
        }
        return ans;
    }
}