package LinkedList;

public class removeInFirstLL {
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
        // Remove the first node
        // -------------------------
        public void removeFirst() {
            if (head == null) {
                System.out.println("List is empty. No nodes to remove.");
                return;
            }
            head = head.next; // Move head to the next node
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

        // Inserting nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original Linked List:");
        list.printList();

        // Removing the first node
        list.removeFirst();
        System.out.println("Linked List after removing first node:");
        list.printList();
    }
}

/*
 * Example Output:
 * Original Linked List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * Linked List after removing first node:
 * 20 -> 30 -> 40 -> NULL
 * 
 * Initial List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * 
 * Remove first node:
 * - Move head to the next node (20)
 * 
 * Resulting List:
 * 20 -> 30 -> 40 -> NULL
 * -----------------------------------------------------
 * Output:
 * Original Linked List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * Linked List after removing first node:
 * 20 -> 30 -> 40 -> NULL
 * 
 */