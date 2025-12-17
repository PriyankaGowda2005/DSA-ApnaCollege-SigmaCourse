package DivideAndConquer;

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        int result = search(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        // Binary search in rotated sorted array
        while (low <= high) {
            // find mid
            int mid = low + (high - low) / 2;
            // check if mid is target
            if (arr[mid] == target) {
                return mid;
            }
            // check which part is sorted
            if (arr[low] <= arr[mid]) {
                // left part is sorted
                if (target >= arr[low] && target < arr[mid]) { // target is in left part
                    high = mid - 1; // search in left part
                } else { // target is in right part
                    low = mid + 1;// search in right part
                }
            } else { // right part is sorted
                if (target > arr[mid] && target <= arr[high]) { // target is in right part
                    low = mid + 1;// search in right part
                } else { // target is in left part
                    high = mid - 1;// search in left part
                }
            }
        }

        return -1; // target not found
    }
    // Time complexity O(log n)
    // Space complexity O(1)
    // where n is number of elements in array
    // iterative approach
    // binary search in rotated sorted array
    // return index of target if found else return -1
    // assume no duplicate elements in array
    // array is rotated sorted array
    // example: [4,5,6,7,0,1,2]
    // target = 0
    // output: 4
    // used in searching in rotated sorted array
    // dry run with examples /[4,5,6,7,0,1,2], target = 0 => output: 4 /*
    /*
     * Dry run the code for understanding : -
     * first iteration: low = 0, high = 6, mid = 3, arr[mid] = 7
     * arr[low] <= arr[mid] => left part is sorted
     * target >= arr[low] && target < arr[mid] => target is in right part
     * low = mid + 1 => low = 4
     * second iteration: low = 4, high = 6, mid = 5, arr[mid] = 1
     * arr[low] <= arr[mid] => left part is sorted
     * target >= arr[low] && target < arr[mid] => target is in left part
     * high = mid - 1 => high = 4
     * third iteration: low = 4, high = 4, mid = 4, arr[mid] = 0
     * arr[mid] == target => return mid => return 4
     * output: 4
     */

    // edge cases handled
    // tested and verified

}