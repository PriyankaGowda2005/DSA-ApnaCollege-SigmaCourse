package LinkedList;

public class addFirstInLL {
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
        // Insert a new node at front
        // -------------------------
        public void addFirst(int data) {
            Node newNode = new Node(data);

            // New node points to current head
            newNode.next = head;

            // Update head to new node
            head = newNode;
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

        // Adding elements at the front
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        // Print the linked list
        list.printList();
    }

}
/*
 * Example Output:
 * Adding 10 at front → head = 10 -> NULL
 * Adding 20 at front → head = 20 -> 10 -> NULL
 * Adding 30 at front → head = 30 -> 20 -> 10 -> NULL
 * Adding 40 at front → head = 40 -> 30 -> 20 -> 10 -> NULL
 * Linked List:
 * 40 -> 30 -> 20 -> 10 -> NULL
 */

