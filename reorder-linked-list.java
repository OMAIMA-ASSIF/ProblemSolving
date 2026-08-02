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


    public void reorderList(ListNode head) {
        ListNode tmp = head;
        int n = 0; 
        while(tmp!=null){
            n++;
            tmp = tmp.next;
        }
        if(n%2==0){
            n=n/2;
        }else{
            n =(n+1)/2; 
        }

        ListNode p1 = head;
        ListNode p2 = head;
        for(int i=1; i<=n-1; i++){
            p2 = p2.next;
        }
        p2.next = reverseList(p2.next);
        for(int i=1; i<n ; i++){
            ListNode nv = p2.next ;
            p2.next = p2.next.next;
            nv.next = p1.next;
            p1.next = nv;
            
            p1 = p1.next.next;
            
        }

    }
}
