package Stack;

import java.util.Stack;

public class validParanthese {

    // --------------------------
    // Function to check if parentheses are valid
    // --------------------------
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {

            // If opening bracket, push onto stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket, check for matching opening
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // If stack is empty → all brackets matched
        return stack.isEmpty();
    }

    // --------------------------
    // Main method to test
    // --------------------------
    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "({[]})";

        System.out.println(s1 + " is valid? " + isValid(s1));
        System.out.println(s2 + " is valid? " + isValid(s2));
        System.out.println(s3 + " is valid? " + isValid(s3));
    }
}
/*
 * 🔹 Dry Run
 * Input String      Stack Operations                  Is Valid
 * "{[()]}"         Push {, [, ( → Pop (, [, {       true
 * "{[(])}"         Push {, [, ( → Pop (, mismatch     false
 * "({[]})"         Push (, {, [, ] → Pop ], }, )     true
 * 
 * Output:
 * {[()]} is valid? true
 * {[(])} is valid? false
 * ({[]}) is valid? true

 🔹 Dry Run Example: s = "{[()]}"
Char	Stack before	Action	Stack after
{	[]	Opening → push	[{]
[	[{]	Opening → push	[{, []
(	[{, []	Opening → push	[{, [, (]
)	[{, [, (]	Closing → matches (?	[{, []
]	[{, []	Closing → matches [?	[{]
}	[{]	Closing → matches {?	[]

✅ Stack empty → valid parentheses

Output:

{[()]} is valid? true
{[(])} is valid? false
({[]}) is valid? true

 */