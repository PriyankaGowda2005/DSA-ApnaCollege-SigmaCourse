package LinkedList;

public class removeCycleLL {

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
        // Detect and remove cycle
        // -------------------------
        public void removeCycle() {
            if (head == null || head.next == null) return;

            Node slow = head;
            Node fast = head;

            // Step 1: Detect cycle using Floyd's algorithm
            boolean cycleDetected = false;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    cycleDetected = true;
                    break;
                }
            }

            if (!cycleDetected) {
                System.out.println("No cycle detected.");
                return;
            }

            // Step 2: Find start of the cycle
            slow = head;
            Node prev = null; // To keep track of the node before meeting point
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            // Step 3: Remove cycle
            prev.next = null; // Break the cycle
            System.out.println("Cycle removed.");
        }

        // Print linked list safely
        public void printList() {
            Node current = head;
            int count = 0;
            while (current != null && count < 50) { // safety counter
                System.out.print(current.data + " -> ");
                current = current.next;
                count++;
            }
            if (current != null) System.out.print("...");
            else System.out.print("NULL");
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

        // Create a cycle for testing: 40 -> 20
        list.head.next.next.next.next = list.head.next;

        // Detect and remove cycle
        list.removeCycle();

        // Print linked list after removing cycle
        list.printList();
    }
}
/* 
List with cycle: 10 -> 20 -> 30 -> 40 -> 20 -> ...

Step 1: Detect cycle
- slow=10, fast=10
- Iteration 1: slow=20, fast=30
- Iteration 2: slow=30, fast=20
- Iteration 3: slow=40, fast=40 → cycle detected

Step 2: Find start of cycle
- Reset slow=head=10
- Move slow and fast one step at a time
- prev tracks fast's previous node
- slow=10, fast=40 → not equal
- slow=20, fast=20 → start of cycle found
- prev=40

Step 3: Remove cycle
- prev.next = null → 40.next = null

Resulting list:
10 -> 20 -> 30 -> 40 -> NULL
Cycle removed.
10 -> 20 -> 30 -> 40 -> NULL

*/