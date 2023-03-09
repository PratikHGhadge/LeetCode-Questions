/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCyle = false;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                isCyle = true;
                break;
            }
        }
        fast = head;
        if(isCyle){
            while(fast!=slow){
                fast = fast.next;
                slow = slow.next;
            }
        }else{
            return null;
        }
        return slow;
    }
}