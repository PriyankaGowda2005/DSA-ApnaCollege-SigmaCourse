package LinkedList;

public class addLastInLL {
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
    // LinkedList class with head and tail nodes
    // -----------------------------------------------------
    static class LinkedList {
        Node head; // Head of the list
        Node tail; // Tail of the list

        // -------------------------
        // Add a new node at end
        // -------------------------
        public void addLast(int data) {
            Node newNode = new Node(data);

            // If list is empty, new node becomes head and tail
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }

            // Append new node at the end and update tail
            tail.next = newNode;
            tail = newNode;
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

        // Adding elements at the end
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        // Print the linked list
        list.printList();
    }
}

/*
 * Example Output:
 * Adding 10 at end → head = 10 -> NULL, tail = 10 -> NULL
 * Adding 20 at end → head = 10 -> 20 -> NULL, tail = 20 -> NULL
 * Adding 30 at end → head = 10 -> 20 -> 30 -> NULL, tail = 30 -> NULL
 * Adding 40 at end → head = 10 -> 20 -> 30 -> 40 -> NULL, tail = 40 -> NULL
 * Linked List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 */