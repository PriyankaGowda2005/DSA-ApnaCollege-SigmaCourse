package basicSorting;

import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array is");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements for array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSortFunction(arr);
        arrayPrint(arr);
    }

    public static void selectionSortFunction(int arr[]) { // Time complexity O(n^2) in all cases
        for (int i = 0; i < arr.length - 1; i++) { // n-1 passes due to array run from 0 to n-1
            // find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) { // j starts from i+1 to n-1 meaning unsorted part of array
                if (arr[j] < arr[minIndex]) { // find minimum element
                    minIndex = j; // update minIndex
                }
            }
            // swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
