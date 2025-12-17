package Arrays;

public class introArray {
    public static void main(String[] args) {
        // Declaration and initialization of an array
        // Syntax: dataType[] arrayName = {value1, value2, value3, ...};
        // size of int array is 4 bytes per element in Java
        // size allocation happens at runtime and declared using new keyword
        int[] numbers = new int[5];

        // Initializing array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // Alternatively, we can declare and initialize in one line
        // Array definition is array store same data type elements in contiguous memory
        // locations which is fixed size
        int[] num = { 10, 20, 30, 40, 50 };

        // Accessing and printing array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // array input output and update
        System.out.println("Updating array elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 5; // Increment each element by 5
            System.out.println("Updated element at index " + i + ": " + numbers[i]);
        }

        // array as Function argument
        System.out.println("Sum of array elements: " + sumArray(numbers));

        // program for Linear Search and it's complexity using function
        int target = 35;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        // function calling for LinearSearch
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // function calling for BinarySearch
        // Note: Binary search requires a sorted array
        int[] sortedArray = { 10, 20, 30, 40, 50, 60, 70 };
        int binaryIndex = binarySearch(sortedArray, target);
        if (binaryIndex != -1) {
            System.out.println("Element " + target + " found at index (Binary Search): " + binaryIndex);
        } else {
            System.out.println("Element " + target + " not found in the array (Binary Search).");
        }
        // function calling for Reverse an array
        System.out.println("Original array before reversing:");
        for (int numElement : numbers) {
            System.out.print(numElement + " ");
        }
        reverseArray(numbers);
        System.out.println("\nReversed array:");
        for (int numElement : numbers) {
            System.out.print(numElement + " ");
        }
        // Largest and Smallest element in an array
        System.out.println("\nLargest element in the array: " + findLargest(numbers));
        System.out.println("Smallest element in the array: " + findSmallest(numbers));
        // Pairs in Array program
        System.out.println("Pairs in the array:");
        int pairCount = pairsArray(numbers);
        System.out.println("Total number of pairs: " + pairCount);
        // Print Subarrays of an array
        System.out.println("Subarrays of the array:");
        printSubarrays(numbers);

        // Print max subArray sum
        int maxSum = maxSubArraySum(numbers);
        System.out.println("Maximum subarray sum: " + maxSum);

    }

    // Function to calculate sum of array elements
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Function for Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // function for Binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Return index if found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if not found
    }

    // function for Reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Largest and Smallest element in an array
    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    //Smallest element in array
    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    // Pairs in Array program
    public static int pairsArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                count++;
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
        return count;
    }

    // Print Subarrays of an array
    public static void printSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // Print subarray from index i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Print max subArray sum
    public static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    System.out.println("New max subarray found: " + currentSum);
                }
            }
        }
        return maxSum;
    }
}
