package LinkedList;

public class revDoublyLL {

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
            newNode.prev = current; // Update previous pointer
        }

        // -------------------------
        // Print the doubly linked list
        // -------------------------
        public void printList() {
            Node current = head;
            System.out.print("NULL <- ");
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.next;
            }
            System.out.println("NULL");
        }

        // -------------------------
        // Reverse the doubly linked list
        // -------------------------
        public void reverse() {
            Node temp = null;
            Node current = head;

            // Swap next and prev for all nodes
            while (current != null) {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev; // Move to next node (previously next)
            }

            // Update head
            if (temp != null) {
                head = temp.prev;
            }
        }
    }

    // -------------------------
    // Main method
    // -------------------------
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);

        System.out.println("Original Doubly Linked List:");
        dll.printList();

        dll.reverse();

        System.out.println("Reversed Doubly Linked List:");
        dll.printList();
    }
}
/* 
Original DLL: NULL <- 10 <-> 20 <-> 30 <-> 40 <-> NULL

Step 1: Start with head = 10
- Swap next and prev for 10 → next= null, prev=20
- Move current = prev (current = 20)

Step 2: For 20
- Swap next and prev → next=10, prev=30
- Move current = prev (current = 30)

Step 3: For 30
- Swap next and prev → next=20, prev=40
- Move current = prev (current = 40)

Step 4: For 40
- Swap next and prev → next=30, prev=null
- current = null → stop

Update head = last node processed = 40

Reversed DLL: NULL <- 40 <-> 30 <-> 20 <-> 10 <-> NULL
Original Doubly Linked List:
NULL <- 10 <-> 20 <-> 30 <-> 40 <-> NULL
Reversed Doubly Linked List:
NULL <- 40 <-> 30 <-> 20 <-> 10 <-> NULL

*/