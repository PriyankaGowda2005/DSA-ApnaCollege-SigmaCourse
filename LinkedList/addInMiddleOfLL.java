package LinkedList;

public class addInMiddleOfLL {

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

        // Insert a node at a specific position (0-based index)
        public void insertAtPosition(int data, int position) {
            Node newNode = new Node(data);

            // Insert at beginning
            if (position == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node current = head;
            int count = 0;

            // Traverse to the node just before the desired position
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }

            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }

            // Insert the new node
            newNode.next = current.next;
            current.next = newNode;
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

        // Insert nodes at the end
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List before inserting in middle:");
        list.printList();

        // Insert 25 at position 2 (middle)
        list.insertAtPosition(25, 2);

        System.out.println("Linked List after inserting 25 at position 2:");
        list.printList();
    }
}
/*
 * Example Output:
 * Linked List before inserting in middle:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * Linked List after inserting 25 at position 2:
 * 10 -> 20 -> 25 -> 30 -> 40 -> NULL
 * 
 * Initial List:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * 
 * Insert 25 at position 2:
 * - Traverse to position 1 (node with value 20)
 * - newNode.next = current.next (30)
 * - current.next = newNode (25)
 * 
 * Resulting List:
 * 10 -> 20 -> 25 -> 30 -> 40 -> NULL
 * Linked List before inserting in middle:
 * 10 -> 20 -> 30 -> 40 -> NULL
 * Linked List after inserting 25 at position 2:
 * 10 -> 20 -> 25 -> 30 -> 40 -> NULL
 * 
 */