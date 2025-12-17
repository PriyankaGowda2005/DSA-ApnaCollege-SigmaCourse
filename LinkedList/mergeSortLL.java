package LinkedList;

public class mergeSortLL {

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
        // Merge Sort on Linked List
        // -------------------------
        public Node mergeSort(Node head) {
            if (head == null || head.next == null) return head; // Base case

            // Step 1: Split list into halves
            Node middle = getMiddle(head);
            Node nextOfMiddle = middle.next;
            middle.next = null; // Split

            // Step 2: Recursively sort left and right halves
            Node left = mergeSort(head);
            Node right = mergeSort(nextOfMiddle);

            // Step 3: Merge sorted halves
            Node sortedList = sortedMerge(left, right);
            return sortedList;
        }

        // -------------------------
        // Helper: Merge two sorted linked lists
        // -------------------------
        private Node sortedMerge(Node a, Node b) {
            if (a == null) return b;
            if (b == null) return a;

            Node result;
            if (a.data <= b.data) {
                result = a;
                result.next = sortedMerge(a.next, b);
            } else {
                result = b;
                result.next = sortedMerge(a, b.next);
            }
            return result;
        }

        // -------------------------
        // Helper: Find middle node
        // -------------------------
        private Node getMiddle(Node head) {
            if (head == null) return head;
            Node slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    // -------------------------
    // Main method
    // -------------------------
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(30);
        list.insert(10);
        list.insert(50);
        list.insert(20);
        list.insert(40);

        System.out.println("Original Linked List:");
        list.printList();

        // Sort the linked list
        list.head = list.mergeSort(list.head);

        System.out.println("Sorted Linked List:");
        list.printList();
    }
}
/* 
Original List: 30 -> 10 -> 50 -> 20 -> 40 -> NULL

Step 1: Split into halves
- Left: 30 -> 10 -> NULL
- Right: 50 -> 20 -> 40 -> NULL

Step 2: Recursively split further
- Left: 30 -> 10 → 30 and 10
- Right: 50 -> 20 -> 40 → 50 and 20 -> 40 → 20 and 40

Step 3: Merge sorted halves
- Merge 30 & 10 → 10 -> 30
- Merge 20 & 40 → 20 -> 40
- Merge 50 & 20 -> 20 -> 40 -> 50
- Merge 10 -> 30 & 20 -> 40 -> 50 → 10 -> 20 -> 30 -> 40 -> 50

Sorted List: 10 -> 20 -> 30 -> 40 -> 50 -> NULL
Original Linked List:
30 -> 10 -> 50 -> 20 -> 40 -> NULL
Sorted Linked List:
10 -> 20 -> 30 -> 40 -> 50 -> NULL

*/