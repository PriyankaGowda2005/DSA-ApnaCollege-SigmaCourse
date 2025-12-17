package LinkedList;

public class findAndRemoveNthNodeFromEnd {

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

        // -------------------------
        // Remove Nth node from end
        // -------------------------
        public void removeNthFromEnd(int n) {
            Node dummy = new Node(0); // Dummy node
            dummy.next = head;
            Node first = dummy;
            Node second = dummy;

            // Move first pointer n+1 steps ahead
            for (int i = 0; i <= n; i++) {
                if (first == null) {
                    System.out.println("N is larger than the list size.");
                    return;
                }
                first = first.next;
            }

            // Move both pointers until first reaches end
            while (first != null) {
                first = first.next;
                second = second.next;
            }

            // Remove the nth node from end
            second.next = second.next.next;

            // Update head in case first node was removed
            head = dummy.next;
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
        list.insert(50);

        System.out.println("Original Linked List:");
        list.printList();

        // Remove 2nd node from end
        int n = 2;
        list.removeNthFromEnd(n);

        System.out.println("Linked List after removing " + n + "th node from end:");
        list.printList();
    }
}
/*
 * Original List:
 * 10 -> 20 -> 30 -> 40 -> 50 -> NULL
 * n = 2
 * 
 * Step 1: Use dummy node → 0 -> 10 -> 20 -> 30 -> 40 -> 50
 * Step 2: Move first pointer n+1 = 3 steps ahead → first points at 30
 * Step 3: Move first and second until first reaches null:
 * - first=40, second=10
 * - first=50, second=20
 * - first=null, second=30
 * Step 4: Remove node after second → 30.next = 30.next.next → removes 40
 * 
 * Resulting List:
 * 10 -> 20 -> 30 -> 50 -> NULL
 * 
 * Original Linked List:
 * 10 -> 20 -> 30 -> 40 -> 50 -> NULL
 * Linked List after removing 2th node from end:
 * 10 -> 20 -> 30 -> 50 -> NULL
 * 
 */