package LinkedList;

public class iterativeSearchLL {

    // -----------------------------------------------------
    // Node class represents each element in the LinkedList
    // -----------------------------------------------------
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // -----------------------------------------------------
    // LinkedList class with head node and methods
    // -----------------------------------------------------
    static class LinkedList {
        Node head;

        // Insert a new node at the end
        public void insert(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Iterative search for a value in linked list
        public boolean search(int key) {
            Node current = head;

            while (current != null) {
                if (current.data == key) {
                    return true; // Key found
                }
                current = current.next;
            }

            return false; // Key not found
        }

        // Print the linked list
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

        // Insert nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Print the list
        System.out.println("Linked List:");
        list.printList();

        // Search for a value
        int key = 30;
        if (list.search(key)) {
            System.out.println(key + " found in the linked list.");
        } else {
            System.out.println(key + " not found in the linked list.");
        }

        // Search for a value not present
        key = 50;
        if (list.search(key)) {
            System.out.println(key + " found in the linked list.");
        } else {
            System.out.println(key + " not found in the linked list.");
        }
    }
}
/*
 * Linked List: 10 -> 20 -> 30 -> 40 -> NULL
 * 
 * Search for 30:
 * - current = 10 → not equal
 * - current = 20 → not equal
 * - current = 30 → match → return true
 * 
 * Search for 50:
 * - current = 10 → not equal
 * - current = 20 → not equal
 * - current = 30 → not equal
 * - current = 40 → not equal
 * - current = null → return false
 * Linked List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * 30 found in the linked list.
 * 50 not found in the linked list.
 * 
 */