package LinkedList;

public class sizeOfLL {
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
        // Calculate size of linked list
        // -------------------------
        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
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

        // Print size of linked list
        System.out.println("Size of linked list: " + list.size());
    }
}
/*
 * 
 * Insert 10 → head = 10 -> NULL
 * Insert 20 → head = 10 -> 20 -> NULL
 * Insert 30 → head = 10 -> 20 -> 30 -> NULL
 * Insert 40 → head = 10 -> 20 -> 30 -> 40 -> NULL
 * Size of linked list: 4
 * -----------------------------------------------------
 * Output:
 * Size of linked list: 4
 */