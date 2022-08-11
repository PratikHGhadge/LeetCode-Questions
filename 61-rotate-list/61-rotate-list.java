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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        
        int size = 0;
        ListNode previous = null, current = head;
        
        while(current != null){
            previous = current;
            current = current.next;
            size++;
        }
        previous.next = head;

        k = k % size;
        int rotate = size - k;
        previous = null;
        
        for(int i = 0; i < rotate; i++){
            previous = head;
            head = head.next;
        }
        previous.next = null;
        return head;
    }
}