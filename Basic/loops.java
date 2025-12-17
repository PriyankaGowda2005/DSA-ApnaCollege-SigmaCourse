package Basic;

public class loops {
    public static void main(String[] args) {
        // Syntax of loops in java
        /*
         * for(initialization; condition; increment/decrement){
         * // code to be executed
         * }
         *
         * while(condition){
         * // code to be executed
         * increment/decrement;
         * }
         *
         * do{
         * // code to be executed
         * increment/decrement;
         * }while(condition);
         */

        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);

        // print numbers from 1 to 10 using for loop
        System.out.println("\nNumbers from 1 to 10 using For Loop:");
        for (int num = 1; num <= 10; num++) {
            System.out.println(num);
        }

        // print numbers from 1 to N using while loop
        System.out.println("\nNumbers from 1 to N using While Loop:");
        int N = 10;
        int num = 1;
        while (num <= N) {
            System.out.println(num);
            num++;
        }

        // Sum of first N natural numbers using do-while loop
        System.out.println("\nSum of first N natural numbers using Do-While Loop:");
        int limit = 10;
        int sum = 0;
        int number = 1;
        do {
            sum += number;
            number++;
        } while (number <= limit);
        System.out.println("Sum: " + sum);

        // print square pattern using for loop
        System.out.println("\nSquare Pattern using For Loop:");
        int size = 5;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // multiplication table
        System.out.println("\nMultiplication Table:");
        int tableSize = 5;
        for (int i = 1; i <= tableSize; i++) {
            for (int p = 1; p <= tableSize; p++) {
                System.out.print(i * p + "\t");
            }
            System.out.println();
        }

        // Reverse a given number
        System.out.println("\nReverse a given number:");
        int originalNumber = 12345;
        int reversedNumber = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }
        System.out.println("Reversed Number: " + reversedNumber);

        // break and continue statements
        System.out.println("\nUsing break statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // terminate the loop when i is 3
            }
            System.out.println("Iteration: " + i);
        }
        System.out.println("\nUsing continue statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip the iteration when i is 3
            }
            System.out.println("Iteration: " + i);
        }

        // syntax of enhanced for loop
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int nums : numbers) {
            System.out.println("Number: " + num);
        }

        // character pattern using nested loops
        System.out.println("\nCharacter Pattern using Nested Loops:");
        int patternSize = 5;
        for (int i = 1; i <= patternSize; i++) {
            for (int l = 1; l <= i; l++) {
                System.out.print((char) ('A' + l - 1) + " ");
            }
            System.out.println();
        }

        // check if number is prime or not program
        System.out.println("\nCheck if a number is prime:");
        int checkNumber = 29;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(checkNumber); i++) {
            if (checkNumber % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(checkNumber + " is a prime number.");
        } else {
            System.out.println(checkNumber + " is not a prime number.");
        }
    }
}
