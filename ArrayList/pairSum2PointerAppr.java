package ArrayList;

public class pairSum2PointerAppr {

    public static void main(String[] args) {

        // Input array (sorted)
        int[] arr = { 2, 3, 4, 5, 7, 8, 9 };

        // Target sum to find
        int targetSum = 10;

        System.out.println("Pairs with sum " + targetSum + ":");

        // Initialize two pointers
        int left = 0; // Start of array
        int right = arr.length - 1; // End of array

        /*
         * TWO POINTER APPROACH:
         * ---------------------
         * 1. Start with left=0 and right=n-1
         * 2. Calculate currentSum = arr[left] + arr[right]
         * 3. If currentSum == targetSum, print the pair and move both pointers
         * 4. If currentSum < targetSum, move left pointer to the right
         * 5. If currentSum > targetSum, move right pointer to the left
         * 6. Repeat until left >= right
         */

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == targetSum) {
                // Found a pair
                System.out.println("(" + arr[left] + ", " + arr[right] + ")");
                left++;
                right--;
            } else if (currentSum < targetSum) {
                // Need a bigger sum → move left pointer
                left++;
            } else {
                // Need a smaller sum → move right pointer
                right--;
            }
        }
    }
}

/*
arr = [2,3,4,5,7,8,9], targetSum = 10

Step 1:
left=0, right=6 → 2+9=11 > 10 → move right--
right=5 → 2+8=10 → print (2,8), left++, right--
left=1, right=4 → 3+7=10 → print (3,7), left++, right--
left=2, right=3 → 4+5=9 < 10 → move left++
left=3, right=3 → left >= right → stop

Pairs with sum 10:
(2, 8)
(3, 7)


*/