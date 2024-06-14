package linkedList; 

import java.util.*; 

class Node { // Defines the Node class for the singly linked list
    int data; // Data stored in the node
    Node next; // Reference to the next node in the list

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head; // Head of the list

    // Constructor to initialize an empty list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to insert a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty
            head = newNode; // Set the new node as the head
        } else {
            Node current = head; // Start from the head
            while (current.next != null) { // Traverse to the end of the list
                current = current.next; // Move to the next node
            }
            current.next = newNode; // Set the new node as the last node
        }
    }

    // Method to display the elements of the list
    public void display() {
        Node current = head; // Start from the head
        while (current != null) { // Traverse the list
            System.out.print(current.data + " "); // Print the data of each node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a newline at the end
    }

    // Main method to test the singly linked list
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new singly linked list
        list.insert(108); // Insert 108 into the list
        list.insert(92); // Insert 92 into the list
        list.insert(53); // Insert 53 into the list
        list.insert(77); // Insert 77 into the list
        list.insert(6); // Insert 6 into the list

        System.out.println("Singly Linked List:"); // Print a header
        list.display(); // Display the list
    }
}
