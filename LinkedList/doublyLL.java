package LinkedList;

public class doublyLL {

    // -----------------------------------------------------
    // Node class represents each element in the Doubly LinkedList
    // -----------------------------------------------------
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // -----------------------------------------------------
    // DoublyLinkedList class with head node and methods
    // -----------------------------------------------------
    static class DoublyLinkedList {
        Node head; // Head node

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

            // Insert at the end
            current.next = newNode;
            newNode.prev = current; // Update previous pointer
        }

        // -------------------------
        // Print the doubly linked list forward
        // -------------------------
        public void printForward() {
            Node current = head;
            System.out.print("NULL <- ");
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.next;
            }
            System.out.println("NULL");
        }

        // -------------------------
        // Print the doubly linked list backward
        // -------------------------
        public void printBackward() {
            if (head == null)
                return;

            // Go to the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            // Traverse backward using prev
            System.out.print("NULL <- ");
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.prev;
            }
            System.out.println("NULL");
        }
    }

    // -------------------------
    // Main method
    // -------------------------
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert nodes at end
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);

        System.out.println("Doubly Linked List (Forward):");
        dll.printForward();

        System.out.println("Doubly Linked List (Backward):");
        dll.printBackward();
    }
}
/*
Dry Run Example

Step 1: Insert 10 → Head = 10 → NULL
Step 2: Insert 20 → 10 <-> 20 → NULL
Step 3: Insert 30 → 10 <-> 20 <-> 30 → NULL
Step 4: Insert 40 → 10 <-> 20 <-> 30 <-> 40 → NULL

Forward Traversal:

Start at head → 10 → 20 → 30 → 40 → NULL

Backward Traversal:

Start at last node → 40 → 30 → 20 → 10 → NULL
Doubly Linked List (Forward):
NULL <- 10 <-> 20 <-> 30 <-> 40 <-> NULL
Doubly Linked List (Backward):
NULL <- 40 <-> 30 <-> 20 <-> 10 <-> NULL

*/