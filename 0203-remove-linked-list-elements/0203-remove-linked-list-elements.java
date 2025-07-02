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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val) 
        {
            head=head.next;
        }
        ListNode tptr=head;
        while(tptr!=null && tptr.next!=null)
        {
            if(tptr.next.val==val)
            {
                tptr.next=tptr.next.next;
            }
            else
            {
                tptr=tptr.next;
            }
        }
        return head;
    }
}