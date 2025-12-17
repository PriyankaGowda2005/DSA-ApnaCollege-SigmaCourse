package Stack;

public class revStringUsingStack {

    // -----------------------------
    // Stack class for characters
    // -----------------------------
    static class Stack {
        private char[] arr; // Array to store stack elements
        private int top; // Index of top element
        private int capacity; // Maximum size of stack

        // Constructor to initialize stack
        public Stack(int size) {
            arr = new char[size];
            capacity = size;
            top = -1; // Stack is empty initially
        }

        // Push character onto stack
        public void push(char c) {
            if (top == capacity - 1) { // Check for overflow
                System.out.println("Stack Overflow!");
                return;
            }
            arr[++top] = c; // Increment top and store char
        }

        // Pop character from stack
        public char pop() {
            if (isEmpty()) { // Check for underflow
                System.out.println("Stack Underflow!");
                return '\0';
            }
            return arr[top--]; // Return top element and decrement top
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return top == -1;
        }
    }

    // -----------------------------
    // Function to reverse a string
    // -----------------------------
    public static String reverseString(String str) {
        int n = str.length();
        Stack stack = new Stack(n);

        // Step 1: Push all characters onto stack
        for (int i = 0; i < n; i++) {
            stack.push(str.charAt(i));
        }

        // Step 2: Pop characters from stack to form reversed string
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return reversedStr.toString();
    }

    // -----------------------------
    // Main method
    // -----------------------------
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
/*
 * 
 * Original String: Hello, World!
 * Reversed String: !dlroW ,olleH
 * 
 🔹 Dry Run Example

Input: "Hello"

Step 1 – Push onto stack

Operation	Stack (Top → Bottom)
push('H')	H
push('e')	e → H
push('l')	l → e → H
push('l')	l → l → e → H
push('o')	o → l → l → e → H

Step 2 – Pop to reverse

Pop Operation	Reversed String	Stack (Top → Bottom)
pop() = 'o'	"o"	l → l → e → H
pop() = 'l'	"ol"	l → e → H
pop() = 'l'	"oll"	e → H
pop() = 'e'	"olle"	H
pop() = 'H'	"olleH"	(empty)

Final Output: "olleH"

✅ Key Points:

Stack follows LIFO (Last In First Out), perfect for reversing sequences.

Using an array is simple, but dynamic arrays (ArrayList) or LinkedList can also be used.

Push all characters → Pop all characters = reversed string.
 */