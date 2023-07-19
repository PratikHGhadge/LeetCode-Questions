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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(l1!=null || l2!=null){
            int ans = carry;
            if(l1!=null) ans+=l1.val;
            if(l2!=null) ans+=l2.val;
            ListNode node = new ListNode(ans%10);
            carry = ans/10;
            temp.next = node;
            temp = temp.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
        }
        return dummy.next;
    }
}