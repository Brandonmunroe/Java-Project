import java.util.PriorityQueue;
import java.util.Queue;

public class MergeSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeSortedLists(Queue<ListNode> lists) {
        // Priority Queue to store nodes based on smallest value first
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add all non-null list heads into the priority queue
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        // Dummy head to build the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Keep extracting the smallest node and linking them
        while (!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll();
            current.next = smallest;
            current = current.next;

            // If the smallest node has a next, add it to the heap
            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Test the method
    public static void main(String[] args) {
        // Create sample lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        Queue<ListNode> lists = new java.util.LinkedList<>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        // Merge and print
        ListNode merged = mergeSortedLists(lists);
        printList(merged);
    }
}
