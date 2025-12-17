package LinkedList;

public class removeLastInLL {
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
        // Remove the last node
        // -------------------------
        public void removeLast() {
            // If list is empty
            if (head == null) {
                return;
            }

            // If list has only one node
            if (head.next == null) {
                head = null;
                return;
            }

            // Traverse to the second last node
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }

            // Remove last node
            current.next = null;
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
        LinkedList list = new LinkedList();

        // Inserting elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original Linked List:");
        list.printList();

        // Removing last element
        list.removeLast();
        System.out.println("After removing last element:");
        list.printList();
    }
}
/*
 * 
 * Original Linked List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * After removing last element:
 * 10 -> 20 -> 30 -> NULL
 */
