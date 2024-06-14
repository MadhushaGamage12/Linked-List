package linkedList; 

import java.util.*; 

// Defines the linked list Queue class to implement a queue using a singly linked list
public class LLQueue {
    // Defines the Node class to represent each element in the queue
    class Node {
        public int data; // Data stored in the node
        public Node next; // Reference to the next node in the queue
    }

    private Node first; // Reference to the front of the queue

    // Constructor to initialize an empty queue
    public LLQueue() {
        first = null; // Initialize first as null
    }

    // Method to insert a node at the beginning of the list (used internally)
    public void insertFirst(int x) {
        Node n = new Node(); // Create a new node
        n.data = x; // Set the data for the new node
        n.next = first; // Link the new node to the current first node
        first = n; // Update the first node to the new node
    }

    // Method to add a node to the end of the queue
    public void enqueue(int x) {
        if (first == null) { // If the queue is empty
            insertFirst(x); // Insert the new node at the beginning
        } else {
            Node n = new Node(); 
            n.data = x; 
            Node temp = first; // Start from the first node
            while (temp.next != null) // Traverse to the end of the queue
                temp = temp.next; // Move to the next node
            n.next = temp.next; // Set the new node's next to null (end of the list)
            temp.next = n; // Link the last node to the new node
        }
    }

    // Method to remove and return the front node of the queue
    public int dequeue() {
        if (first == null) { // If the queue is empty
            throw new NoSuchElementException(); // Throw an exception
        } else {
            int ret = first.data; // Store the data of the first node
            first = first.next; // Update first to the next node
            return ret; 
        }
    }

  
    public int peek() {
        if (first == null) { // If the queue is empty
            throw new NoSuchElementException(); // Throw an exception
        } else {
            return first.data; // Return the data of the first node
        }
    }

    // Main method to test the queue implementation
    public static void main (String[] args) {
        LLQueue queue = new LLQueue(); // Create a new queue
        queue.enqueue(108); // Enqueue 108
        queue.enqueue(52); // Enqueue 52
        queue.enqueue(83); // Enqueue 83

        // Print the first element using peek
        System.out.print("First peek: " + queue.peek());

        // Dequeue and print each element
        System.out.print("\nFirst dequeue: " + queue.dequeue() + "\nSecond dequeue: " + queue.dequeue() + "\nThird dequeue: " + queue.dequeue());
    }
}
