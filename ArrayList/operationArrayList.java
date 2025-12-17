package ArrayList;

public class operationArrayList {
    public static void main(String[] args) {

        // Create an ArrayList of Strings
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        // -------------------------------
        // Add elements to the ArrayList
        // -------------------------------
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the ArrayList
        System.out.println("Initial List: " + list);

        // -----------------------------------
        // Accessing elements using get(index)
        // -----------------------------------
        System.out.println("Element at index 1: " + list.get(1)); // Banana

        // ------------------------
        // Updating an element
        // ------------------------
        list.set(1, "Blueberry");
        System.out.println("After update: " + list);

        // ------------------------
        // Removing an element
        // ------------------------
        list.remove("Cherry"); // remove by value
        System.out.println("After removing 'Cherry': " + list);

        // ------------------------
        // Check if element exists
        // ------------------------
        System.out.println("Contains Apple? " + list.contains("Apple"));

        // ------------------------
        // Size of the ArrayList
        // ------------------------
        System.out.println("Size of list: " + list.size());

        // ------------------------
        // Iterating over ArrayList
        // ------------------------
        System.out.println("\nIterating through list:");
        for (String item : list) {
            System.out.println(item);
        }
        // Size of ArrayList
        System.out.println("Size of list: " + list.size());
        // ------------------------
        // Clear the ArrayList
        // ------------------------
        list.clear();
        System.out.println("After clearing, size: " + list.size());
    }
}
