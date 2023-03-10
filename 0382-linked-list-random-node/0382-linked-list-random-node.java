/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ArrayList<Integer> list;
    public Solution(ListNode head) {
        list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        double d = Math.random()*list.size();
        return list.get((int)d);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */