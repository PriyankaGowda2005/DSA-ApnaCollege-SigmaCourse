package Basic;

public class operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // true

        // Logical Operators
        System.out.println("Logical AND: " + ((a > 5) && (b < 10))); // true
        System.out.println("Logical OR: " + ((a > 5) || (b > 10))); // true
        System.out.println("Logical NOT: " + !(a > b)); // false

        // Assignment Operators
        int c = a; // Assignment
        c += b; // c = c + b
        System.out.println("c after += : " + c); // 15
        c -= b; // c = c - b
        System.out.println("c after -= : " + c); // 10
        c *= b; // c = c * b
        System.out.println("c after *= : " + c); // 50
        c /= b; // c = c / b
        System.out.println("c after /= : " + c); // 10
        c %= b; // c = c % b
        System.out.println("c after %= : " + c); // 0

        // unary Operators
        int d = 5;
        System.out.println("Post-increment: " + (d++)); // 5
        System.out.println("After Post-increment: " + d); // 6
        System.out.println("Pre-increment: " + (++d)); // 7
        System.out.println("Post-decrement: " + (d--)); // 7
        System.out.println("After Post-decrement: " + d); // 6
        System.out.println("Pre-decrement: " + (--d)); // 5
        System.out.println("After Pre-decrement: " + d); // 4

    }
}
