class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        
        // Traverse the list until the end
        while (current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                // Move to next distinct element
                current = current.next;
            }
        }
        
        return head;
    }
}
