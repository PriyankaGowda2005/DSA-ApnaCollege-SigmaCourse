package Stack;

import java.util.Stack; // Import the Stack class from Java Collections Framework

public class stackUsingCollectionFramework {

    public static void main(String[] args) {

        System.out.println("Stack implementation using Java Collections Framework\n");

        // --------------------------
        // Create a stack of integers
        // --------------------------
        Stack<Integer> stack = new Stack<>();

        // --------------------------
        // 1. Push elements onto the stack
        // --------------------------
        stack.push(10); // Stack: 10
        stack.push(20); // Stack: 10, 20
        stack.push(30); // Stack: 10, 20, 30

        System.out.println("Stack after pushes: " + stack);

        // --------------------------
        // 2. Peek at the top element
        // --------------------------
        System.out.println("Top element using peek(): " + stack.peek()); // 30

        // --------------------------
        // 3. Pop element from stack
        // --------------------------
        System.out.println("Popped element: " + stack.pop()); // Removes 30
        System.out.println("Stack after pop: " + stack); // 10, 20

        // --------------------------
        // 4. Check if stack is empty
        // --------------------------
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        // --------------------------
        // 5. Size of stack
        // --------------------------
        System.out.println("Size of stack: " + stack.size()); // 2
    }
}
/*
 * 🔹 Dry Run
 * Operation Stack Content Top Element
 * push(10) 10 10
 * push(20) 10, 20 20
 * push(30) 10, 20, 30 30
 * peek() 10, 20, 30 30
 * pop() 10, 20 20
 * isEmpty() 10, 20 false
 * size() 10, 20 2
 * 
 * Stack implementation using Java Collections Framework
 * 
 * Stack after pushes: [10, 20, 30]
 * Top element using peek(): 30
 * Popped element: 30
 * Stack after pop: [10, 20]
 * Is stack empty? false
 * Size of stack: 2
 * 
 */