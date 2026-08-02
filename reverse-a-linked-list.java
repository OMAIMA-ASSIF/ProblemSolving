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

    /* O(n) space complexity
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
    */

    //O(1) space complexity
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // save next node
            curr.next = prev;          // reverse the pointer
            prev = curr;               // move prev
            curr = next;               // move curr
        }

        head = prev;
        return head;
    }

}
