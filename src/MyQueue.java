import java.util.NoSuchElementException;

public class MyQueue {

    // Nested Node class
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Queue fields
    private Node front; // head (first element)
    private Node rear;  // tail (last element)
    private int size;   // number of elements

    // Constructor: creates an empty queue
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Enqueue: add an element to the end (rear)
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue: remove and return the value at the front
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int value = front.value;
        front = front.next;
        size--;

        // If the queue becomes empty, rear should also be null
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Peek: view the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.value;
    }

    // isEmpty: check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // size: return the number of elements
    public int size() {
        return size;
    }

    // clear: remove all elements
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    // toString: represent the queue from front to rear
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("front -> ");
        Node current = front;
        while (current != null) {
            sb.append(current.value).append(" -> ");
            current = current.next;
        }
        sb.append("rear");
        return sb.toString();
    }

    // Test main method
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue); // front -> 1 -> 2 -> 3 -> rear

        System.out.println("Peek: " + queue.peek()); // 1
        System.out.println("Dequeue: " + queue.dequeue()); // 1
        System.out.println(queue); // front -> 2 -> 3 -> rear

        System.out.println("Size: " + queue.size()); // 2

        queue.clear();
        System.out.println("Cleared: " + queue); // front -> rear
    }
}

