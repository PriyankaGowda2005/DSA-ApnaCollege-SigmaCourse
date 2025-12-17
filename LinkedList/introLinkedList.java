package LinkedList;

public class introLinkedList {

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
    // Main method
    // -------------------------
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList list = new LinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Print the list
        System.out.println("Linked List:");
        list.printList();
    }
}

/*
 * Insert 10 → head = 10 -> NULL
 * Insert 20 → head = 10 -> 20 -> NULL
 * Insert 30 → head = 10 -> 20 -> 30 -> NULL
 * Insert 40 → head = 10 -> 20 -> 30 -> 40 -> NULL
 * Linked List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 */