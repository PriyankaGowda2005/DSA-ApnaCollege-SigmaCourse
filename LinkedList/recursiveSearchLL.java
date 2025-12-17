package LinkedList;

public class recursiveSearchLL {

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

        // -------------------------
        // Recursive search
        // -------------------------
        public boolean searchRecursive(int key) {
            return searchHelper(head, key);
        }

        private boolean searchHelper(Node current, int key) {
            if (current == null) {
                return false; // Reached end → not found
            }

            if (current.data == key) {
                return true; // Key found
            }

            return searchHelper(current.next, key); // Recur for next node
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

        // Search for values recursively
        int key = 20;
        System.out.println(key + " found? " + list.searchRecursive(key));

        key = 50;
        System.out.println(key + " found? " + list.searchRecursive(key));
    }
}
/*
 * Linked List: 10 -> 20 -> 30 -> 40 -> NULL
 * 
 * Search for 20:
 * - current = 10 → not equal → recur on next
 * - current = 20 → equal → return true
 * 
 * Search for 50:
 * - current = 10 → not equal → recur
 * - current = 20 → not equal → recur
 * - current = 30 → not equal → recur
 * - current = 40 → not equal → recur
 * - current = null → return false
 * Linked List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * 20 found? true
 * 50 found? false
 * 
 */