package linkedList;
import static java.lang.System.exit;

public class StackUsingSinglyLinkedList {

    // Main method to test the stack implementation
    public static void main(String[] args) {
        StackUsingLinkedlist obj = new StackUsingLinkedlist(); // Create a new stack
        
        // Push elements onto the stack
        obj.push(108); 
        obj.push(83); 
        obj.push(52); 
        obj.push(6); 

        // Display stack elements
        obj.display(); 

        // Print top element of the stack
        System.out.printf("\nTop element is %d\n", obj.peek()); 

        // Pop elements from the stack
        obj.pop(); 
        obj.pop(); 

        // Display stack elements after popping
        obj.display(); 

        // Print top element of the stack
        System.out.printf("\nTop element is %d\n", obj.peek()); 
    }
}

// Class to implement stack using linked list
class StackUsingLinkedlist {
     
    // A linked list node class
    private class Node {
        int data; // Integer data stored in the node
        Node link; // Reference to the next node
    }
    
    // Reference to the top of the stack
    Node top;

    // Constructor to initialize an empty stack
    StackUsingLinkedlist() { 
        this.top = null; 
    }
 
    // Method to add an element x to the stack
    public void push(int x) {
        // Create a new node
        Node temp = new Node();

        // Check if stack (heap) is full to prevent overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // Initialize data into temp data field
        temp.data = x;

        // Link the new node to the current top
        temp.link = top;

        // Update top reference to the new node
        top = temp;
    }
 
    // Method to check if the stack is empty
    public boolean isEmpty() { 
        return top == null; 
    }
 
    // Method to return the top element in the stack
    public int peek() {
        // Check if stack is not empty
        if (!isEmpty()) {
            return top.data; // Return top data
        } else {
            System.out.println("Stack is empty");
            return -1; // Return -1 if stack is empty
        }
    }
 
    // Method to pop the top element from the stack
    public void pop() {
        // Check for stack underflow
        if (top == null) {
            System.out.print("\nStack Under_flow");
            return;
        }

        // Update top to the next node
        top = top.link;
    }
 
    // Method to display the elements of the stack
    public void display() {
        // Check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Under_flow");
            exit(1); // Exit if the stack is empty
        } else {
            Node temp = top;
            while (temp != null) {
                // Print node data
                System.out.print(temp.data);

                // Move to the next node
                temp = temp.link;
                if (temp != null)
                    System.out.print(" -> ");
            }
        }
    }
}
