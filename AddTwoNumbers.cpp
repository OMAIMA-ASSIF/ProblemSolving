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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        ListNode* result=new ListNode();
        ListNode* temp=result;
        int carry=0;
        while(l1!= nullptr || l2!= nullptr){
            int sum = 0 ;
            if(l1 != nullptr){
                sum+= l1->val;
                l1=l1->next;
            }
            if(l2 != nullptr){
                sum+= l2->val;
                l2=l2->next;
            }
            sum +=carry;
            carry=sum/10;
            sum = sum%10;
            temp->next = new ListNode(sum);
            temp=temp->next;
        }
        if (carry ==1) temp->next = new ListNode(1);
        return result->next;
        
    }
};
