package LinkedList;

public class circularLL {

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

            // If list is empty, point new node to itself
            if (head == null) {
                head = newNode;
                newNode.next = head; // Circular link
                return;
            }

            // Traverse to the last node
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }

            // Insert new node and maintain circular nature
            current.next = newNode;
            newNode.next = head;
        }

        // -------------------------
        // Print the circular linked list
        // -------------------------
        public void printList() {
            if (head == null)
                return;

            Node current = head;
            do {
                System.out.print(current.data + " -> ");
                current = current.next;
            } while (current != head);
            System.out.println("(back to head: " + head.data + ")");
        }
    }

    // -------------------------
    // Main method
    // -------------------------
    public static void main(String[] args) {
        LinkedList cll = new LinkedList();

        // Insert nodes
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        System.out.println("Circular Linked List:");
        cll.printList();
    }
}
/* 
🔹 Dry Run Example

Insert 10

Head = 10 → points to itself → 10 → 10

Insert 20

Last node = 10

10 → 20 → 10 (circular link)

Insert 30

Last node = 20

10 → 20 → 30 → 10

Insert 40

Last node = 30

10 → 20 → 30 → 40 → 10

Printing:

Start at head → 10 → 20 → 30 → 40 → back to head 10

Circular Linked List:
10 -> 20 -> 30 -> 40 -> (back to head: 10)

*/