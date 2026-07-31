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
    public ListNode reverseList(ListNode head) {
        if (head!=null){
            ListNode head2 = new ListNode(head.val, null);
            head = head.next;
            while(head!=null){
                head2 = new ListNode(head.val, head2);
                head = head.next;
            }

            return head2;
        }
        return head;
    }

}
