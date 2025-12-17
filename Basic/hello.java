package Basic;
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();   
        System.out.println("Hello, " + name + "!");
        scanner.close();
        System.out.println("Scanner closed.");
    }
}