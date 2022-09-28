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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = new ListNode();
        p2.next = head;
        int size = 0;
        while(p1!=null){
            size++;
            p1 = p1.next;
        }
        int n1 = size - n;
        if(n1==0){
            return head.next;
        }
        for(int i = 0; i<n1; i++){
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return head;
    }
}