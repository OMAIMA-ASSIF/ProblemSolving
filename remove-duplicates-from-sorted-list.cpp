class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
         if (head == nullptr){
            return head;
            }
        ListNode* temp = nullptr, *curr = head;
        while(curr->next != nullptr){
            if(curr->val == curr->next->val){
                temp = curr->next;
                curr->next = temp->next;
                delete temp;
            }else {
                curr = curr->next;
            }
        }
        return head;
    }
};
