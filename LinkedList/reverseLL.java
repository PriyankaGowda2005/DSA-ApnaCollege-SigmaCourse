package LinkedList;

public class reverseLL {
    // -----------------------------------------------------
    // Node class represents each element in the LinkedList
    // -----------------------------------------------------
    static class Node {
        int data; // Data of the node
        Node next; // Pointer to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // -----------------------------------------------------
    // LinkedList class with head node and methods
    // -----------------------------------------------------
    static class LinkedList {
        Node head; // Head of the list

        // -------------------------
        // Insert a new node at end
        // -------------------------
        public void insert(int data) {
            Node newNode = new Node(data);

            // If list is empty, new node becomes head
            if (head == null) {
                head = newNode;
                return;
            }

            // Traverse to the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            // Append new node at the end
            current.next = newNode;
        }

        // -------------------------
        // Reverse the linked list
        // -------------------------
        public void reverse() {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next; // Store next node
                current.next = prev; // Reverse current node's pointer
                prev = current; // Move pointers one position ahead
                current = next;
            }
            head = prev; // Update head to new first element
        }

        // -------------------------
        // Print the linked list
        // -------------------------
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("NULL");
        }
    }

    // -------------------------
    // Main method to test the LinkedList
    // -------------------------
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original Linked List:");
        list.printList();

        // Reversing the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
/*
 * 
 * Original Linked List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * Reversed Linked List:
 * 40 -> 30 -> 20 -> 10 -> NULL
 */