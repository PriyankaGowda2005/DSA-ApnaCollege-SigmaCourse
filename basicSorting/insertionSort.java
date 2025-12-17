package basicSorting;

import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array is");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements for array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSortFunction(arr);
        arrayPrint(arr);
    }

    public static void insertionSortFunction(int arr[]) { // Time complexity O(n^2) in worst and average case, O(n) in
                                                          // best case
        int n = arr.length; // length of array
        for (int i = 1; i < n; i++) { // starts from 1 to n-1
            int key = arr[i]; // current element to be inserted
            int j = i - 1; // index of the last element in the sorted part
            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) { // shift element to right
                arr[j + 1] = arr[j]; // shift element to right
                j--; // move to the previous element
            }
            arr[j + 1] = key; // insert the key at the correct position
        }
        // The array is now sorted
    }

    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
