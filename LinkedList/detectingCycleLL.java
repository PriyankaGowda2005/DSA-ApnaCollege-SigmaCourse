package LinkedList;

public class detectingCycleLL {

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

        // -------------------------
        // Insert a new node at end
        // -------------------------
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
        // Detect cycle in linked list using Floyd's algorithm
        // -------------------------
        public boolean hasCycle() {
            if (head == null || head.next == null)
                return false;

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true; // Cycle detected
                }
            }

            return false; // No cycle
        }

        // Print linked list (note: unsafe if cycle exists)
        public void printList() {
            Node current = head;
            int count = 0; // Safety counter to avoid infinite loop in case of cycle
            while (current != null && count < 20) {
                System.out.print(current.data + " -> ");
                current = current.next;
                count++;
            }
            if (current != null) {
                System.out.print("...");
            } else {
                System.out.print("NULL");
            }
            System.out.println();
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

        // Create a cycle for testing: last node points back to node with value 20
        list.head.next.next.next.next = list.head.next; // 40 -> 20

        // Detect cycle
        if (list.hasCycle()) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle in the linked list.");
        }
    }
}
/*
 * List with cycle: 10 -> 20 -> 30 -> 40 -> 20 -> ...
 * 
 * Step 1: Initialize slow=head=10, fast=head=10
 * Step 2: Move pointers
 * - Iteration 1: slow=20, fast=30
 * - Iteration 2: slow=30, fast=20
 * - Iteration 3: slow=40, fast=40 → slow == fast → Cycle detected
 * Cycle detected in the linked list.
 * 
 */