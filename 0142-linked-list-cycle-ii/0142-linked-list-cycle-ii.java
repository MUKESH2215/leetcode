/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode start) {
        ListNode slow=start,fast=start;
        while(fast!=null  && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(fast==null || fast.next==null) return null;
        while(start!=slow)
        {
            start=start.next;
            slow=slow.next;
        }
        return start;
    }
}