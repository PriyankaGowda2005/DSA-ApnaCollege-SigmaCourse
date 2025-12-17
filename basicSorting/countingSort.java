package basicSorting;

public class countingSort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 8, 3, 3, 1 };
        countingSortFunction(arr);
        arrayPrint(arr);
    }

    public static void countingSortFunction(int arr[]) { // Time complexity O(n+k) where n is number of elements and k
                                                         // is range of input
        int n = arr.length; // length of array
        int max = Integer.MIN_VALUE; // find maximum element in array
        for (int i = 0; i < n; i++) { // traverse the array from 0 to n-1
            if (arr[i] > max) { // update max if current element is greater than max
                max = arr[i]; // update max
            }
        }
        int count[] = new int[max + 1]; // create count array of size max+1
        for (int i = 0; i < n; i++) { // traverse the array from 0 to n-1
            count[arr[i]]++; // increment count of current element
        }
        int index = 0; // index for original array
        for (int i = 0; i <= max; i++) { // traverse the count array from 0 to max
            while (count[i] > 0) { // while count of current element is greater than 0
                arr[index++] = i; // place the current element in original array
                count[i]--; // decrement count of current element
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
