/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode previous = head;
        
        if (head == null) {
            return null;
        }
        
        while (current != null) {
            if (current.val == val) {
                if (current == head) {
                    head = current.next;
                    current = head;
                    previous = current;
                } else {
                    previous.next = current.next;
                    current = previous.next;
                }
            } else {
                previous = current;
                current = current.next;
            }
        }
        
        return head;
    }
}