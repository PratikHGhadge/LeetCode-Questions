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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null || head==null){
            return true;
        }
       Stack<Integer> ans = new Stack();
        ArrayList<Integer> ans1 = new ArrayList<>();
        int size = 0;
        while(head!=null && head.next!=null){
            ans.push(head.val);
            head = head.next;
            size++;
            ans1.add(head.val);
        }
        for(int i = 0; i<size; i++){
            if(ans1.get(i)!=ans.pop()){
                return false;
            }
        }
        
        return true;
    }
}