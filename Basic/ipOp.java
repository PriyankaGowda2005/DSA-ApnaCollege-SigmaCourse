package Basic;

import java.util.*;

public class ipOp {
    public static void main(String[] args) {
        System.out.println("This is a placeholder for input functionality.");
        // Scanner function is used to take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        //sc is object of Scanner class and it's method nextLine() is used to take string input in same way there are other methods like nextInt(), nextDouble() to take integer and double input respectively
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
        scanner.close();
        System.out.println("Scanner closed.");
        // The below line is used to print the output
        /*
         *  The sout is for printing the output in the console annd ln is for moving the cursor to next line after printing the output
         */
        System.out.println("Hello, " + input + "! Welcome to the input program.");

    }
}
