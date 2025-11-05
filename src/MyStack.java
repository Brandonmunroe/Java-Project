import java.util.NoSuchElementException;

public class MyStack {

    // Nested private Node class
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Stack fields
    private Node top; // top of the stack
    private int size; // number of elements

    // Constructor: creates an empty stack
    public MyStack() {
        top = null;
        size = 0;
    }

    // Push: add a new element to the top
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop: remove and return the top element
    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        size--;
        return value;
    }

    // Peek: return top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return top.value;
    }

    // isEmpty: check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // size: return the number of elements in the stack
    public int size() {
        return size;
    }

    // clear: remove all elements
    public void clear() {
        top = null;
        size = 0;
    }

    // toString: display stack from top to bottom
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("top -> ");
        Node current = top;
        while (current != null) {
            sb.append(current.value).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }

    // Test main method
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(3);
        stack.push(5);

        System.out.println(stack); // top -> 5 -> 3 -> 1 -> null

        System.out.println("Peek: " + stack.peek()); // 5
        System.out.println("Pop: " + stack.pop());   // 5
        System.out.println(stack);                   // top -> 3 -> 1 -> null

        System.out.println("Size: " + stack.size()); // 2

        stack.clear();
        System.out.println("Cleared: " + stack);     // top -> null
    }
}

