package LinkedList;

public class zigZagLL {

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
        // Rearrange linked list in zig-zag fashion
        // Format: a < b > c < d > e ...
        // -------------------------
        public void zigZag() {
            if (head == null || head.next == null) return;

            Node current = head;
            boolean less = true; // Start with < comparison

            while (current != null && current.next != null) {
                if (less) {
                    // current.data should be less than next.data
                    if (current.data > current.next.data) {
                        int temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                } else {
                    // current.data should be greater than next.data
                    if (current.data < current.next.data) {
                        int temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                }
                current = current.next;
                less = !less; // Flip the comparison for next pair
            }
        }
    }

    // -------------------------
    // Main method
    // -------------------------
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(4);
        list.insert(3);
        list.insert(7);
        list.insert(8);
        list.insert(6);
        list.insert(2);
        list.insert(1);

        System.out.println("Original Linked List:");
        list.printList();

        list.zigZag();

        System.out.println("Zig-Zag Linked List:");
        list.printList();
    }
}
/* 
Original List: 4 -> 3 -> 7 -> 8 -> 6 -> 2 -> 1 -> NULL

Step 1: Start with less = true
- Compare 4 < 3? No → Swap → 3 -> 4
- less = false

Step 2: Compare 4 > 7? No → Swap → 3 -> 7 -> 4
- less = true

Step 3: Compare 4 < 8? Yes → no swap
- less = false

Step 4: Compare 8 > 6? Yes → no swap
- less = true

Step 5: Compare 6 < 2? No → Swap → 3 -> 7 -> 4 -> 8 -> 2 -> 6 -> 1
- less = false

Step 6: Compare 6 > 1? Yes → no swap

Final Zig-Zag List: 3 -> 7 -> 4 -> 8 -> 2 -> 6 -> 1 -> NULL
Original Linked List:
4 -> 3 -> 7 -> 8 -> 6 -> 2 -> 1 -> NULL
Zig-Zag Linked List:
3 -> 7 -> 4 -> 8 -> 2 -> 6 -> 1 -> NULL

*/