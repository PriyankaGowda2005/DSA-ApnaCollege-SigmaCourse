package Basic;

public class conditionalStatements {
    public static void main(String[] args) {
        int number = 10;
        // If Statement
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        }

        // If-Else Statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + " is zero.");
        }

        // if else ladders
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Nested If Statement
        if (number >= 0) {
            if (number == 0) {
                System.out.println("The number is zero.");
            } else {
                System.out.println("The number is positive.");
            }
        } else {
            System.out.println("The number is negative.");
        }

        //ternary operator
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result + ".");

        // Switch Statement
        switch (number) {
            case 1:
                System.out.println("Number is one.");
                break;
            case 2:
                System.out.println("Number is two.");
                break;
            case 3:
                System.out.println("Number is three.");
                break;
            default:
                System.out.println("Number is greater than three or less than one.");
        }

        //Calculator using switch
        int a = 20;
        int b = 10;
        char operator = '+';
        switch (operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Division by zero error.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        // Check if a student is pass or fail using else if and print pass or fail result
        int marks = 75;
        char grade;
        if (marks >= 60) {
            grade = 'A';
        } else if (marks >= 50) {
            grade = 'B';
        } else if (marks <= 39) {
            System.out.println("Student has failed.");
            grade = 'F';
        } else {
            grade = 'C';
        }
        System.out.println("Student grade: " + grade);

    }
}

// Income tax calculation based on income slabs
// income up to 2.5 lakhs - no tax
// income from 2.5 lakhs to 5 lakhs - 5% tax
// income from 5 lakhs to 10 lakhs - 20% tax
// income above 10 lakhs - 30% tax
class IncomeTaxCalculator {
    public static void main(String[] args) {
        double income = 850000; // example income
        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.05 * (income - 250000);
        } else if (income <= 1000000) {
            tax = 0.20 * (income - 500000) + 12500; // 12500 is tax for income between 2.5L to 5L
        } else {
            tax = 0.30 * (income - 1000000) + 112500; // 112500 is tax for income between 5L to 10L
        }

        System.out.println("Income: " + income);
        System.out.println("Income Tax: " + tax);
    }
}

// print the largest of 3 numbers
class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 78;
        int num3 = 23;

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);
    }
}