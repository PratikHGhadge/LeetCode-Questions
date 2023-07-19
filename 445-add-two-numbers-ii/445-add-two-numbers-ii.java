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
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while(l1!=null){
            stack1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            stack2.push(l2);
            l2=l2.next;
        }
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        while(!stack1.isEmpty() || !stack2.isEmpty() || carry!=0){
            int ans = carry;
            if(!stack1.isEmpty()){
                ans += stack1.pop().val;
            }
            if(!stack2.isEmpty()){
                ans += stack2.pop().val;
            }
            ListNode node = new ListNode(ans%10);
            carry = ans/10;
            node.next = dummy.next;
            dummy.next = node;
        }
        return dummy.next;
    }
}