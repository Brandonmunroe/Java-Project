public class RemoveNthFromEnd {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // Create a dummy node before the head
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode first = dummy;
            ListNode second = dummy;

            // Move first n+1 steps ahead (so gap is n)
            for (int i = 0; i <= n; i++) {
                first = first.next;
            }

            // Move both until first reaches the end
            while (first != null) {
                first = first.next;
                second = second.next;
            }

            // Delete the nth node
            second.next = second.next.next;

            // Return the modified list
            return dummy.next;
        }
    }


}
