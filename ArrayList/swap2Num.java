package ArrayList;

public class swap2Num {
    public static void main(String[] args) {

        // -----------------------------------------------------
        // Create an ArrayList of integers and add 2 elements
        // -----------------------------------------------------
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10); // index 0
        list.add(20); // index 1

        // Print original list
        System.out.println("Before swapping: " + list);

        /*
         * DRY RUN (Swapping elements at index 0 and 1)
         * ----------------------------------------------
         * 
         * Initial list:
         * index: 0 1
         * value: 10 20
         * 
         * Step 1:
         * temp = list.get(0)
         * temp = 10
         * 
         * Step 2:
         * list.set(0, list.get(1))
         * list.set(0, 20)
         * 
         * Now list = [20, 20]
         * 
         * Step 3:
         * list.set(1, temp)
         * list.set(1, 10)
         * 
         * Final list:
         * [20, 10]
         * 
         * Swapping successful!
         */

        // Swapping logic
        int temp = list.get(0); // Step 1: Store first value
        list.set(0, list.get(1)); // Step 2: Move second value to first
        list.set(1, temp); // Step 3: Move stored value to second

        // Print swapped list
        System.out.println("After swapping: " + list);
    }
}
