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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }
        int count = 0;
        while (count != k) {
            ListNode tptr = head;
            while (tptr.next.next != null) {
                tptr = tptr.next;
            }
            ListNode last = tptr.next;
            last.next = head;
            tptr.next = null;
            head = last;
            count++;
        }
        
        return head;
    }
}
