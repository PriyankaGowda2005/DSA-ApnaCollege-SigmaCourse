package ArrayList;

public class multiDimArrayList {
    public static void main(String[] args) {
        // Create a 2D ArrayList
        java.util.ArrayList<java.util.ArrayList<Integer>> multiList = new java.util.ArrayList<>();

        // Add rows to the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            java.util.ArrayList<Integer> row = new java.util.ArrayList<>();
            for (int j = 0; j < 4; j++) {
                row.add(i + j);
            }
            multiList.add(row);
        }

        // Print the 2D ArrayList
        System.out.println("2D ArrayList: " + multiList);

        // Accessing an element
        System.out.println("Element at (1,2): " + multiList.get(1).get(2)); // Should print 3

        // Updating an element
        multiList.get(2).set(3, 99);
        System.out.println("After updating (2,3): " + multiList);

        // Iterating through the 2D ArrayList
        System.out.println("\nIterating through 2D ArrayList:");
        for (java.util.ArrayList<Integer> row : multiList) {
            for (Integer item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
