package Backtracking;

public class arrayChange {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 5 };
        int n = arr.length;
        int changes = minChangesToMakeArrayIncreasing(arr, n);
        System.out.println("Minimum changes required: " + changes);
    }

    public static int minChangesToMakeArrayIncreasing(int[] arr, int n) {
        int changes = 0; // Initialize change counter
        for (int i = 1; i < n; i++) { // Start from the second element
            if (arr[i] <= arr[i - 1]) { // If current element is not greater than previous
                changes += (arr[i - 1] - arr[i] + 1); // Calculate how much to increase
                arr[i] = arr[i - 1] + 1; // Make the current element greater than the previous
                System.out.println("Changed element at index " + i + " to " + arr[i]);
            }
            System.out.println("Array state: " + java.util.Arrays.toString(arr));
            System.out.println("Changes so far: " + changes);
        }
        System.out.println("Final array: " + java.util.Arrays.toString(arr));
        return changes; // Return total changes made

    }
}
/*
 * Dry Run Output:
 * Changed element at index 2 to 5
 * Array state: [1, 4, 5, 2, 5]
 * Changes so far: 2
 * Changed element at index 3 to 6
 * Array state: [1, 4, 5, 6, 5]
 * Changes so far: 4
 * Changed element at index 4 to 7
 * Array state: [1, 4, 5, 6, 7]
 * Changes so far: 6
 * Final array: [1, 4, 5, 6, 7]
 * Minimum changes required: 6
 * Time Complexity: O(n) where n is the number of elements in the array.
 * Space Complexity: O(1) as we are using constant extra space.
 * This approach efficiently ensures the array is strictly increasing with minimal changes.
 */
