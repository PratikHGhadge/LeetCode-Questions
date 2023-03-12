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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int size = 0;
        ListNode p = head;
        while(p!=null){
            size++;
            p = p.next;
        }
        int temp = k;
        if(k>size){temp = k%size;};
        int temp2 = size-temp;
        ListNode p1 = head;
        for(int i = 0; i<temp-1; i++){
            p1 = p1.next;
        }
        ListNode p2 = head;
        for(int i = 0; i<temp2; i++){
            p2 = p2.next;
        }
        int temp3 = p1.val;
        p1.val = p2.val;
        p2.val = temp3;
        return head;
    }
}