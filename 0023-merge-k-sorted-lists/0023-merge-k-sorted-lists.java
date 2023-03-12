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
    public ListNode mergeKLists(ListNode[] lists) { 
        if(lists==null || lists.length==0){
            return null;
        }
        
        return helper(lists, 0, lists.length-1);
    }
    public ListNode helper(ListNode[] lists, int start, int end) {
        if(start==end){
            return lists[start];
        }
        if(start<end){
            int mid = start+(end-start)/2;
            ListNode left = helper(lists, start, mid);
            ListNode right = helper(lists, mid+1, end);
            return mergeTwoLists(left, right);
        }else{
            return null;
        }
        
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        
        while(p1!=null && p2!=null){
            if(p1.val>p2.val){
                dummy.next = p2;
                p2 = p2.next;
            }else{
                dummy.next = p1; 
                p1 = p1.next;
            }
            dummy = dummy.next;
        }
        
        dummy.next = (p1!=null) ? p1 : p2 ;
        
        return ans.next;
    }
}