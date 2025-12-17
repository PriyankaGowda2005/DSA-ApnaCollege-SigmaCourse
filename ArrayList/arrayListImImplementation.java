package ArrayList;

public class arrayListImImplementation {
    public static void main(String[] args) {

        // ---------------------------------------------------------
        // Create an ArrayList of Strings
        // ---------------------------------------------------------
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        // ---------------------------------------------------------
        // Add elements to the ArrayList
        // ---------------------------------------------------------
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // ---------------------------------------------------------
        // Print the ArrayList
        // ---------------------------------------------------------
        System.out.println("ArrayList: " + list);

        // ---------------------------------------------------------
        // Accessing an element using get(index)
        // ---------------------------------------------------------
        System.out.println("Element at index 1: " + list.get(1)); // Banana

        // ---------------------------------------------------------
        // Updating an element using set(index, value)
        // ---------------------------------------------------------
        list.set(2, "Mango");
        System.out.println("After updating index 2: " + list);

        // ---------------------------------------------------------
        // Removing an element by value
        // ---------------------------------------------------------
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // ---------------------------------------------------------
        // Checking if Element Exists
        // ---------------------------------------------------------
        System.out.println("Contains Apple? " + list.contains("Apple"));

        // ---------------------------------------------------------
        // Size of ArrayList
        // ---------------------------------------------------------
        System.out.println("Size of list: " + list.size());

        // ---------------------------------------------------------
        // Iterating through ArrayList
        // ---------------------------------------------------------
        System.out.println("\nIterating through list:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
