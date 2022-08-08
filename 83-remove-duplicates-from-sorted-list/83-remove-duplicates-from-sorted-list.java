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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode ans = new ListNode(-1);
        Set<Integer> set = new LinkedHashSet<>();
        while(head!=null){
            set.add(head.val);
            head = head.next;
        }
        ListNode ans1 = ans;
        for(int i: set){
            ListNode temp = new ListNode(i);
            ans.next = temp;
            ans = ans.next;
        }
        return ans1.next;
    }
}