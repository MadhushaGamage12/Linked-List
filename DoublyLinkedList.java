package linkedList; 

import java.util.*; 

public class DoublyLinkedList {

    // Inner class representing a node in the doubly linked list
    public class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node
        Node prev; // Reference to the previous node

        // Constructor to initialize the node with data
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    protected Node head; // Head of the list
    protected Node tail; // Tail of the list

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (head == null) { // If the list is empty
            head = newNode; // The new node is now the head
            tail = newNode; // The new node is also the tail
        } else { 
            newNode.next = head; // New node's next points to current head
            head.prev = newNode; // Current head's previous points to new node
            head = newNode; // New node becomes the head
        }
    }

    // Method to add a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (head == null) { // If the list is empty
            head = newNode; // The new node is now the head
            tail = newNode; // The new node is also the tail
        } else { // If it is not empty
            tail.next = newNode; // Current tail's next points to new node
            newNode.prev = tail; // New node's previous points to current tail
            tail = newNode; // New node becomes the tail
        }
    }

    // Method to find a node with the given data
    public Node find(int data) {
        Node current = head; // Start from the head
        while (current != null && current.data != data) { // Traverse the list
            current = current.next; // Move to the next node
        }
        return current; // Return the found node or null
    }

    // Method to count the number of nodes in the list
    public int count() {
        int count = 0; // Initialize count to 0
        Node current = head; // Start from the head
        while (current != null) { // Traverse the list
            count++; 
            current = current.next; 
        }
        return count; 
    }

    // Method to print the list
    public void printList() {
        Node current = head; // Start from the head
        while (current != null) { // Traverse the list
            System.out.println(current.data); // Print the data of the current node
            current = current.next; // Move to the next node
        }
    }

    // Main method to test the doubly linked list
    public static void main(String[] args) {
    	DoublyLinkedList list = new DoublyLinkedList(); // Create a new doubly linked list
        list.addFirst(108); // Add 108 at the beginning
        list.addLast(52); // Add 52 at the end
        list.addLast(83); // Add 83 at the end
        list.addLast(47); // Add 47 at the end
        list.addFirst(91); // Add 91 at the beginning

        list.printList(); // Print  list

        Node value83 = list.find(83); // Find the node with value 83
        if (value83 != null) {
            System.out.println("Node with value of 83 found: " + value83.data); // Print if found
        } else {
            System.out.println("Node with value of 83 not found."); // Print if not found
        }
    }
}
