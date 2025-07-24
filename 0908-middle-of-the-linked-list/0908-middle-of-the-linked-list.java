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
 import java.util.*;
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode tptr=head;
        int count=0;
        double mid=0;
        if(tptr.next==null)
        {
            return head;
        }
        while(tptr.next!=null)
        {
            tptr=tptr.next;
            count++;
        }
            mid=Math.ceil(count/2);
        
        ListNode temp=head;
        int i=0;
        if(count%2!=0)
        {
        while(i!=mid)
        {
            temp=temp.next;
            i++;
        }
        }
        if(count%2==0)
        {
            while(i!=mid-1)
            {
                temp=temp.next;
                i++;
            }
        }
        head=temp.next;
        return head;
    }
}