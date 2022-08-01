/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        int count = 0;
        if(!head) return NULL;
        if(head->next ==NULL) return head;
        ListNode *temp = head;
        while(temp){
            count++;
            temp = temp->next;
        }
        temp = head;
        for(int i = 1; i<(count/2)+1;i++){
            temp = temp->next;
        }
        return temp;
    }
};