package Stack;

import java.util.Stack;

public class duplicateParanthisis {

    // --------------------------
    // Function to check for duplicate parentheses
    // Example: "((a+b))" → has duplicate
    //          "(a+(b))" → no duplicate
    // --------------------------
    public static boolean hasDuplicate(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // If closing parenthesis, check for duplicates
            if (ch == ')') {
                int count = 0;

                // Count elements inside the parentheses
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                // Pop the opening '('
                if (!stack.isEmpty()) stack.pop();

                // If no element inside → duplicate
                if (count == 0) {
                    return true;
                }
            } else {
                // Push everything else including '('
                stack.push(ch);
            }
        }

        return false; // No duplicate found
    }

    // --------------------------
    // Main method to test
    // --------------------------
    public static void main(String[] args) {
        String expr1 = "((a+b))";
        String expr2 = "(a+(b))";
        String expr3 = "(a+b*(c-d))";

        System.out.println(expr1 + " has duplicate? " + hasDuplicate(expr1));
        System.out.println(expr2 + " has duplicate? " + hasDuplicate(expr2));
        System.out.println(expr3 + " has duplicate? " + hasDuplicate(expr3));
    }
}
/*
 * 🔹 Dry Run
 * Input Expression    Stack Operations                  Has Duplicate
 * "((a+b))"         Push (, (, a, +, b → Pop b, +, a, (   true
 * "(a+(b))"         Push (, a, +, (, b → Pop b, (, +, a   false
 * "(a+b*(c-d))"    Push (, a, +, b, *, (, c, -, d → Pop d, -, c, (, *, b, +, a   false
 * 
 * Output:
 * ((a+b)) has duplicate? true
 * (a+(b)) has duplicate? false
 * (a+b*(c-d)) has duplicate? false
 * 
 * 🔹 Dry Run Example: expr = "((a+b))"
Char	Stack before	Action	Stack after
(	[]	Push	[(]
(	[(]	Push	[(, (]
a	[(, (]	Push	[(, (, a]
+	[(, (, a]	Push	[(, (, a, +]
b	[(, (, a, +]	Push	[(, (, a, +, b]
)	[(, (, a, +, b]	Pop until '(' → count = 3 → not duplicate	[(]
)	[(]	Pop until '(' → count = 0 → duplicate	[]

✅ Output: true
 */