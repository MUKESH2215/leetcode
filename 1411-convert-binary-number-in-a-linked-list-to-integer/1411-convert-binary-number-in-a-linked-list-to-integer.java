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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int res=0;
        int count=0;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        ListNode tptr=head;
        while(tptr!=null)
        {
            res+=tptr.val*Math.pow(2,count);
            count--;
            tptr=tptr.next;
        }
        return res;
    }
}