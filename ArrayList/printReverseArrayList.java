package ArrayList;

public class printReverseArrayList {

    // Function to print the ArrayList in reverse order
    public static void printReverseArrayList(java.util.ArrayList<String> list) {

        /*
         * DRY RUN (Assume list = ["Apple", "Banana", "Cherry", "Date", "Elderberry"])
         * 
         * list.size() = 5
         * Indexes: 0 1 2 3 4
         * Apple Banana Cherry Date Elderberry
         * 
         * Start loop from i = list.size() - 1 = 4
         * 
         * Iteration 1: i = 4 → print "Elderberry"
         * Iteration 2: i = 3 → print "Date"
         * Iteration 3: i = 2 → print "Cherry"
         * Iteration 4: i = 1 → print "Banana"
         * Iteration 5: i = 0 → print "Apple"
         * Loop ends.
         * 
         * Output becomes:
         * Elderberry
         * Date
         * Cherry
         * Banana
         * Apple
         */

        // Loop from last index to first index
        for (int i = list.size() - 1; i >= 0; i--) {
            // Print the element at current index
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        // Creating an ArrayList of Strings
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        // Adding elements into the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Printing header
        System.out.println("ArrayList in reverse order:");

        // Calling function to print list in reverse
        printReverseArrayList(list);
    }
}
