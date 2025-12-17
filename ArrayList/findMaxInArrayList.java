package ArrayList;

public class findMaxInArrayList {

    public static void main(String[] args) {

        // -----------------------------------------------------
        // Create an ArrayList of Integer type
        // -----------------------------------------------------
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        // Add elements to the ArrayList
        list.add(10); // index 0
        list.add(5); // index 1
        list.add(30); // index 2
        list.add(20); // index 3

        /*
         * DRY RUN (What happens inside Collections.max(list))
         * -----------------------------------------------------
         * 
         * list = [10, 5, 30, 20]
         * 
         * Step 1:
         * max = 10 (first element)
         * 
         * Step 2:
         * Compare next elements one by one:
         * 
         * Compare 5 with max(10)
         * → 5 < 10 → max stays 10
         * 
         * Compare 30 with max(10)
         * → 30 > 10 → max becomes 30
         * 
         * Compare 20 with max(30)
         * → 20 < 30 → max stays 30
         * 
         * Final result:
         * max = 30
         * 
         * Therefore Collections.max(list) → 30
         * -----------------------------------------------------
         */

        // Use Collections.max() to find largest element
        int max = java.util.Collections.max(list);

        // Print the result
        System.out.println("Maximum element in the ArrayList: " + max);
    }

}
