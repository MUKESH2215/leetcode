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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode tptr=head;
        while(tptr!=null && tptr.next!=null)
        {
            int temp=tptr.val;
            tptr.val=tptr.next.val;
            tptr.next.val=temp;
            tptr=tptr.next.next;
        }
        return head;
    }
}