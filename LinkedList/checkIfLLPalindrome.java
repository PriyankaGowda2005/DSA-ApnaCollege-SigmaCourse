package LinkedList;

public class checkIfLLPalindrome {

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

        // Insert a new node at end
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

        // Print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("NULL");
        }

        // Check if linked list is palindrome
        public boolean isPalindrome() {
            if (head == null || head.next == null)
                return true;

            // Step 1: Find middle of linked list
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse second half
            Node secondHalf = reverse(slow);

            // Step 3: Compare first and second halves
            Node firstHalf = head;
            Node tempSecond = secondHalf;
            boolean palindrome = true;
            while (tempSecond != null) {
                if (firstHalf.data != tempSecond.data) {
                    palindrome = false;
                    break;
                }
                firstHalf = firstHalf.next;
                tempSecond = tempSecond.next;
            }

            // Step 4: Restore the original list
            reverse(secondHalf);

            return palindrome;
        }

        // Helper function to reverse a linked list
        private Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            while (current != null) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            return prev;
        }
    }

    // -------------------------
    // Main method
    // -------------------------
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Example palindrome list: 1 -> 2 -> 3 -> 2 -> 1
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        System.out.println("Linked List:");
        list.printList();

        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is NOT a palindrome.");
        }
    }
}
/*
 * Linked List: 1 -> 2 -> 3 -> 2 -> 1 -> NULL
 * 
 * Step 1: Find middle
 * - slow moves to 3
 * - fast moves to end
 * 
 * Step 2: Reverse second half: 2 -> 1 becomes 1 -> 2
 * 
 * Step 3: Compare first half (1 -> 2 -> 3) with reversed second half (1 -> 2)
 * - 1 == 1 → OK
 * - 2 == 2 → OK
 * 
 * Step 4: Restore second half
 * - List remains unchanged
 * 
 * Result: Palindrome
 * Linked List:
 * 1 -> 2 -> 3 -> 2 -> 1 -> NULL
 * The linked list is a palindrome.
 * -----------------------------------------------------
 */