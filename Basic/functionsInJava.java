package Basic;

import java.util.*;

public class functionsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Call the add function
        int sum = add(a, b);
        System.out.println("Sum: " + sum);

        // product and division function
        int product = productOfTwo(a, b);
        System.out.println("Product: " + product);
        float division = divisionOfTwo(a, b);
        System.out.println("Division: " + division);

        // Find Factorial of a number using function
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        int factorial = factorialOfNumber(num);
        System.out.println("Factorial: " + factorial);

        // Find Binomial Coefficient using function
        System.out.print("Enter n and r to find Binomial Coefficient (nCr): ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nCr = binomialCoefficient(n, r);
        System.out.println("Binomial Coefficient (nCr): " + nCr);

        // primes in range using function
        System.out.print("Enter range to find primes (start end): ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Primes in range:");
        primesInRange(start, end);

        // Binary to Decimal Conversion using function
        System.out.print("Enter a binary number to convert to decimal: ");
        int binary = sc.nextInt();
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal: " + decimal);

        // Decimal to Binary Conversion using function
        System.out.print("Enter a decimal number to convert to binary: ");
        int decimalNum = sc.nextInt();
        int binaryNum = decimalToBinary(decimalNum);
        System.out.println("Binary: " + binaryNum);
        sc.close();
    }

    // Syntax of function in java
    /*
     * returnType functionName(parameter1Type parameter1Name, parameter2Type
     * parameter2Name, ...) {
     * // function body
     * // return statement (if returnType is not void)
     * }
     * 
     * call by value and call by reference
     * In Java, all primitive data types (int, float, double, char, etc.) are passed
     * by value, meaning that a copy of the variable's value is passed to the
     * method. Changes made to the parameter inside the method do not affect the
     * original variable.
     * Objects (instances of classes) are passed by reference, meaning that a
     * reference (or pointer) to the object is passed to the method. Changes made to
     * the object's attributes inside the method do affect the original object.
     */
    // What is arguments and parameters?
    // Parameters are the variables listed as part of a method's definition.
    // Arguments are the actual values passed to the method when it is called.
    // method overloading and overriding are two important concepts in java
    // functions explained below
    // Method Overloading: It is a feature that allows a class to have more than one
    // method with the same name, but different parameter lists (different type or
    // number of parameters).
    // Method Overriding: It is a feature that allows a subclass to provide a
    // specific implementation of a method that is already defined in its
    // superclass. The method in the subclass must have the same name, return type,
    // and parameters as the method in the superclass.
    // Function to add two numbers
    public static int add(int x, int y) {
        return x + y;
    }

    public static int productOfTwo(int a, int b) {
        int product = a * b;
        return product;
    }

    public static float divisionOfTwo(int a, int b) {
        float division = (float) a / b;
        return division;
    }

    public static int factorialOfNumber(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int binomialCoefficient(int n, int r) {
        return factorialOfNumber(n) / (factorialOfNumber(r) * factorialOfNumber(n - r));
    }

    public static void primesInRange(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // isPrime helper function
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int base = 1; // 2^0
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }
        return decimal;
    }

    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int base = 1; // 10^0
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * base;
            base *= 10;
            decimal /= 2;
        }
        return binary;
    }
}
