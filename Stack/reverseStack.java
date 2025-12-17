package Stack;

public class reverseStack {
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
        // Reverse the stack
        // --------------------------
        public void reverse() {
            if (isEmpty()) {
                return;
            }
            int temp = pop(); // Remove top element
            reverse(); // Recursive call to reverse remaining stack
            pushAtBottom(temp); // Push the removed element at bottom
        }

        // --------------------------
        // Helper method to push element at bottom of stack
        // --------------------------
        private void pushAtBottom(int data) {
            if (isEmpty()) {
                push(data); // If stack is empty, normal push
                return;
            }
            int temp = pop(); // Remove top element
            pushAtBottom(data); // Recursive call
            push(temp); // Push the removed element back
        }
    }
}
/*
 * 
 * This code defines a Stack class using a linked list and includes a method to
 * reverse the stack using recursion.
 * 
 * Key Operations:
 * - push(int data): Pushes an integer onto the stack.
 * - pop(): Removes and returns the top element of the stack.
 * - peek(): Returns the top element without removing it.
 * - isEmpty(): Checks if the stack is empty.
 * - reverse(): Reverses the order of elements in the stack.
 * 
 * The reverse method works by recursively popping elements from the stack and
 * pushing them back at the bottom,
 * effectively reversing the order of elements.
 * 
 */