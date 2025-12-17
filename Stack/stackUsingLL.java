package Stack;

public class stackUsingLL {

    // -------------------------------------
    // Node class represents each stack element
    // -------------------------------------
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // -------------------------------------
    // Stack class implemented using LinkedList
    // -------------------------------------
    static class Stack {
        private Node top; // Top of the stack

        // Constructor
        public Stack() {
            this.top = null;
        }

        // --------------------------
        // Push element onto stack
        // --------------------------
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top; // New node points to current top
            top = newNode; // Update top to new node
            System.out.println("Pushed: " + data);
        }

        // --------------------------
        // Pop element from stack
        // --------------------------
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            int poppedData = top.data;
            top = top.next; // Move top to next node
            return poppedData;
        }

        // --------------------------
        // Peek at top element
        // --------------------------
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return top.data;
        }

        // --------------------------
        // Check if stack is empty
        // --------------------------
        public boolean isEmpty() {
            return top == null;
        }

        // --------------------------
        // Size of stack
        // --------------------------
        public int size() {
            int count = 0;
            Node current = top;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

    // -------------------------------------
    // Main method to test the stack
    // -------------------------------------
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10); // Stack: 10
        stack.push(20); // Stack: 20 -> 10
        stack.push(30); // Stack: 30 -> 20 -> 10

        System.out.println("Top element (peek): " + stack.peek()); // 30
        System.out.println("Popped element: " + stack.pop()); // 30
        System.out.println("Top element after pop: " + stack.peek()); // 20
        System.out.println("Stack size: " + stack.size()); // 2
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
/*
 * 🔹 Dry Run
 * Operation Stack Content Top Element
 * push(10) 10 10
 * push(20) 20 -> 10 20
 * push(30) 30 -> 20 -> 10 30
 * peek() 30 -> 20 -> 10 30
 * pop() 20 -> 10 20
 * peek() 20 -> 10 20
 * size() 20 -> 10 2
 * isEmpty() 20 -> 10 false
 * 
 * Pushed: 10
 * Pushed: 20
 * Pushed: 30
 * Top element (peek): 30
 * Popped element: 30
 * Top element after pop: 20
 * Stack size: 2
 * Is stack empty? false
 */