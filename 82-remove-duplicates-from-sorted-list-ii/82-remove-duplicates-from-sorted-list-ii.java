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
        List<Integer> temp = new ArrayList<>();
        while(head!=null){
            if(set.contains(head.val)){
                temp.add(head.val);
                set.remove(head.val);
            }else{
                set.add(head.val);    
            }
            head = head.next;
        }
        for(int i : temp){
            if(set.contains(i)){
                set.remove(i);
            }
        }
        ListNode ans1 = ans;
        for(int i: set){
            ListNode temp1 = new ListNode(i);
            ans.next = temp1;
            ans = ans.next;
        }
        return ans1.next;
    }
}