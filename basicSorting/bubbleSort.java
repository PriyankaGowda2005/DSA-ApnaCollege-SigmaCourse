package basicSorting;

import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array is");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements for array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSortFunction(arr);
        arrayPrint(arr);
    }

    public static void bubbleSortFunction(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) { // n-1 passes
            for (int j = 0; j < n - 1 - turn; j++) { // each pass run from 0 to n-1-turn means array length -1 - turn
                // swap if arr[j] > arr[j+1]
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void bubbleSortOptimized(int arr[]) { // Time complexity O(n) in best case for sorted array
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) { // n-1 passes
            boolean swapped = false; // to check if any swapping happened in this pass
            for (int j = 0; j < n - 1 - turn; j++) { // each pass run from 0 to n-1-turn means array length -1 - turn
                // swap if arr[j] > arr[j+1]
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // set swapped to true if swapping happened
                }
            }
            if (!swapped) { // if no swapping happened, array is sorted
                break;
            }
        }
    }

    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
