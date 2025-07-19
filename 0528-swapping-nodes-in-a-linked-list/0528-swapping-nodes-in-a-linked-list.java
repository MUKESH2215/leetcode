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
    public ListNode swapNodes(ListNode head, int k) {
        int count=0;
        int count1=0;
        ListNode tptr=head;
        if(head==null || head.next==null) return head;
        while(tptr!=null)
        {
            count++;
            tptr=tptr.next;
        }
          tptr=head;
        for(int i=0;i<k-1;i++)
        {
            tptr=tptr.next;
        }
        ListNode trtv=head;
        for(int i=0;i<count-k;i++)
        {
            trtv=trtv.next;
        }
        
        int temp=tptr.val;
        tptr.val=trtv.val;
        trtv.val=temp;
        return head;
    }
}