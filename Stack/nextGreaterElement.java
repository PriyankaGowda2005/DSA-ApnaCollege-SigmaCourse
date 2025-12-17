package Stack;

public class nextGreaterElement {

    // Function to find and print Next Greater Element for each array element
    public static void printNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n]; // Array to store Next Greater Elements
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Pop all elements smaller than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, there is no greater element on the right
            nge[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element onto stack
            stack.push(arr[i]);
        }

        // Print the Next Greater Elements
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " --> " + nge[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25 };
        printNextGreaterElements(arr);
    }
}
/*
 * 
 * 4 --> 5
 * 5 --> 25
 * 2 --> 25
 * 25 --> -1
    🔹 Dry Run (arr = [4, 5, 2, 25])
i (index)	arr[i]	Stack (after pops)	Next Greater Element (nge[i])	Stack (after push)
3	25	[]	-1	[25]
2	2	[25]	25	[25, 2]
1	5	[25,2] → pop 2	25	[25,5]
0	4	[25,5]	5	[25,5,4]

Output:

4 --> 5
5 --> 25
2 --> 25
25 --> -1


✅ Key Points:

Stack stores potential next greater elements, not indices.

Traverse from right to left because we want the next greater element.

If stack is empty after popping smaller elements → no greater element, set -1.

Push the current element after processing → it can be the next greater for elements to its left.
 */