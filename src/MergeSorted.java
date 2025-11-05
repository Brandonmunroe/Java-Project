public class MergeSorted {
    public static class LinkedList {
        //  Private inner Node class
        private class Node {
            String value;
            Node next;

            Node(String value) {
                this.value = value;
                this.next = null;
            }
        }

        // Fields
        private Node head;
        private Node tail;
        private int size;

        // Constructor
        public LinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        // Return size of list
        public int size() {
            return size;
        }

        // Return true if empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Add to end
        public void add(String value) {
            Node newNode = new Node(value);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        // Add to beginning
        public void addFirst(String value) {
            Node newNode = new Node(value);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        // Get element by index
        public String get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.value;
        }

        // Remove first occurrence of value
        public boolean remove(String value) {
            if (isEmpty()) return false;

            if (head.value.equals(value)) {
                head = head.next;
                size--;
                if (head == null) tail = null;
                return true;
            }

            Node current = head;
            while (current.next != null && !current.next.value.equals(value)) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
                if (current.next == null) tail = current;
                size--;
                return true;
            }

            return false;
        }

        // Clear entire list
        public void clear() {
            head = null;
            tail = null;
            size = 0;
        }

        // Convert to string
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node current = head;
            while (current != null) {
                sb.append(current.value);
                if (current.next != null) sb.append(" -> ");
                current = current.next;
            }
            return sb.toString();
        }

        // Test main method
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.add("A");
            list.add("B");
            list.addFirst("Start");
            System.out.println(list); // Output: Start -> A -> B
            System.out.println("Size: " + list.size());
            list.remove("A");
            System.out.println(list); // Output: Start -> B
            list.clear();
            System.out.println("After clear: " + list.isEmpty());
        }
    }

}
