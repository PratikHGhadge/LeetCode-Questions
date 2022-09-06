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
        if(root==null){
            return ans;
        }
        Queue<Node> mq = new ArrayDeque<>();
        mq.offer(root);
        while(!mq.isEmpty()){ 
            int size = mq.size();
            List<Integer> temp = new ArrayList<>();
            while(size>0){
                root = mq.poll();
                temp.add(root.val);
                for(Node ch : root.children){
                    mq.offer(ch);
                }   
                size--;
            }
            ans.add(temp);
        }
        return ans;
    }
}