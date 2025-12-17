package Basic;

import java.util.*;

public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is :" + sum);
        sc.close();
        int product = productOfTwo(num1, num2);
        System.out.println("The product of two numbers is :" + product);
        float division = divisionOfTwo(num1, num2);
        System.out.println("The division of two numbers is :" + division);
    }

    public static int productOfTwo(int a, int b) {
        int product = a * b;
        return product;
    }

    public static float divisionOfTwo(int a, int b) {
        float division = (float) a / b;
        return division;
    }
}
