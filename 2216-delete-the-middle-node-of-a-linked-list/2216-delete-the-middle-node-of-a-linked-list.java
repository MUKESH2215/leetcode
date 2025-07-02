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
    public ListNode deleteMiddle(ListNode head) {
        // ListNode tptr=head;
        // int count=0;
        // if(head==null || head.next==null) return null;
        // while(tptr!=null)
        // {
        //     count++;
        //     tptr=tptr.next;
        // }
        // ListNode temp=head;
        // for(int i=0;i<(count/2)-1;i++)
        // {
        //     temp=temp.next;
        // }
        //   temp.next=temp.next.next;

        
        // return head ;


        ListNode slow=head,fast=head,pre=head;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            pre=slow;
            slow=slow.next;
        }
        pre.next=slow.next;
        return head;

    }
}