/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tptr1=headA;
        ListNode tptr2=headB;
        while(tptr1!=tptr2)
        {
            tptr1=tptr1.next;
            tptr2=tptr2.next;
            if(tptr1==tptr2) return tptr1;
            if(tptr1==null)
            {
                tptr1=headB;
            }
            if(tptr2==null)
            {
                tptr2=headA;
            }

        }
        return tptr2;
    }
}