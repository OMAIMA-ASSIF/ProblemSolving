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
/*O(n) Time & Space Complexity
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tmp = head;
        Set<ListNode> visited = new HashSet<>();

        while(tmp!=null){
            if(visited.contains(tmp)){
                return true;
            }
            visited.add(tmp);
            tmp = tmp.next;
        }

        return false;
        
    }
}
*/

//O(n) Time Complexity, O(1) : Space complexity
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            

            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }
}
