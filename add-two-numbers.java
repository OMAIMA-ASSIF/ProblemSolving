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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tmp1 = l1;
        ListNode tmp2 = l2;
        ListNode prev = null;

        int carry = 0;

        while (tmp1 != null || tmp2 != null) {

            if (tmp1 == null) {
                prev.next = new ListNode(0);
                tmp1 = prev.next;
            }

            int x = tmp1.val;
            int y = (tmp2 != null) ? tmp2.val : 0;

            int sum = x + y + carry;

            tmp1.val = sum % 10;
            carry = sum / 10;

            prev = tmp1;
            tmp1 = tmp1.next;

            if (tmp2 != null)
                tmp2 = tmp2.next;
        }

        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return l1;
    }
}
