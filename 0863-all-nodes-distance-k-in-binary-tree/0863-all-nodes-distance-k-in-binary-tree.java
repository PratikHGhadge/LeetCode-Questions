/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent_track = new HashMap<>();
        map_parent_track(root, parent_track);
        Queue<TreeNode> que = new LinkedList<>();
        Set<TreeNode> set = new HashSet<>();
        que.offer(target);
        set.add(target);
        int level = 0;
        while(!que.isEmpty()){
            int size = que.size();
            if(k==level) break;
            level++;
            for(int i = 0; i<size; i++){
                TreeNode node = que.poll();
                if(node.left!=null && !set.contains(node.left)){
                    que.offer(node.left);
                    set.add(node.left);
                }
                if(node.right!=null && !set.contains(node.right)){
                    que.offer(node.right);
                    set.add(node.right);
                }
                if(parent_track.get(node)!=null && !set.contains(parent_track.get(node))){
                    que.offer(parent_track.get(node));
                    set.add(parent_track.get(node));
                }
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        while(!que.isEmpty()){
            TreeNode node = que.poll();
            ans.add(node.val);
        }
        return ans;
    }
    public void map_parent_track(TreeNode root, Map<TreeNode, TreeNode> parent_track) {
        if(root==null) return;
        if(root.left!=null){
            parent_track.put(root.left, root);
            map_parent_track(root.left, parent_track);
        } 
        if(root.right!=null){
            parent_track.put(root.right, root);
            map_parent_track(root.right, parent_track);    
        }
    }
}
