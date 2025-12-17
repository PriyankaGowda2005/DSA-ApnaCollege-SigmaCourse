package Stack;

public class pushAtBottomStack {

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
        // Push element onto stack (normal push)
        // --------------------------
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
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
            top = top.next;
            return poppedData;
        }

        // --------------------------
        // Peek top element
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
        // Push element at bottom of stack
        // Recursive approach
        // --------------------------
        public void pushAtBottom(int data) {
            if (isEmpty()) {
                push(data); // If stack is empty, normal push
                return;
            }
            int temp = pop(); // Remove top element
            pushAtBottom(data); // Recursive call
            push(temp); // Push the removed element back
        }

        // --------------------------
        // Print stack elements
        // --------------------------
        public void printStack() {
            Node current = top;
            System.out.print("Stack (Top -> Bottom): ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // -------------------------------------
    // Main method
    // -------------------------------------
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30); // Stack: 30 -> 20 -> 10

        System.out.println("\nOriginal Stack:");
        stack.printStack();

        System.out.println("\nPush 5 at bottom:");
        stack.pushAtBottom(5); // Stack: 30 -> 20 -> 10 -> 5
        stack.printStack();
    }
}
/*
 * 
 * Original Stack:
 * Stack (Top -> Bottom): 30 20 10
 * 
 * Push 5 at bottom:
 * Pushed: 5
 * Stack (Top -> Bottom): 30 20 10 5
 * 🔹 Dry Run Example
 * Operation Stack (Top → Bottom) Explanation
 * push(10) 10 Top = 10
 * push(20) 20 → 10 Top = 20
 * push(30) 30 → 20 → 10 Top = 30
 * pushAtBottom(5) 30 → 20 → 10 → 5 Recursively pop all elements, push 5,
 * restore
 * printStack() 30 → 20 → 10 → 5 Prints top to bottom
 * 
 */