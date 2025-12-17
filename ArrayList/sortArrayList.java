package ArrayList;

public class sortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(5);
        list.add(78);
        list.add(23);

        // Print original list
        System.out.println("Original list: " + list);

        // Sort the ArrayList
        java.util.Collections.sort(list);

        // Print sorted list
        System.out.println("Sorted list: " + list);
    }
}
