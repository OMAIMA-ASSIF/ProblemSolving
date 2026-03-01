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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(0);
        ListNode current = list;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1 == null){
            while(list2 != null){
                current.next = new ListNode(list2.val);
                list2 = list2.next;
                current = current.next;
            }
            return list.next;
        }
        while(list1 != null){
                current.next = new ListNode(list1.val);
                list1 = list1.next;
                current = current.next;
            }
        return list.next;


    }
}
