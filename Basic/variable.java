package Basic;

import java.util.*;

public class variable {
    // declare number at class scope so it's always accessible
    // static int number = 10;

    public static void main(String[] args) {
        // Variable declaration and initialization
        // Syntax: dataType variableName = value;
        int number = 10; // moved to class field above for broader accessibility and scope
        String text = "Hello, World!"; // example of string variable of size 2 bytes per character
        Double decimalValue = 5.5; // example of double variable of size 8 bytes
        Float floatValue = 3.5f; // example of float variable of size 4 bytes
        Character characterValue = 'A'; // example of char variable of size 2 bytes
        Long longValue = 100000L; // example of long variable of size 8 bytes
        Byte byteValue = 20; // example of byte variable of size 1 byte
        Short shortValue = 30000; // example of short variable of size 2 bytes
        // Printing variable values
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
        // The below line is used to print the output
        System.out.println("Hello, " + text + "! Your number is " + number + ".");
        System.out.println("Decimal Value: " + decimalValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Character Value: " + characterValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);

    }
}