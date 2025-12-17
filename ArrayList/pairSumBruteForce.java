package ArrayList;

public class pairSumBruteForce {

    public static void main(String[] args) {

        // Input array
        int[] arr = { 2, 4, 3, 5, 7, 8, 9 };

        // Target sum
        int targetSum = 10;

        System.out.println("Pairs with sum " + targetSum + ":");

        /*
         * BRUTE FORCE APPROACH:
         * ---------------------
         * 1. Use two nested loops to check all possible pairs.
         * 2. Outer loop: i from 0 to n-1
         * 3. Inner loop: j from i+1 to n-1
         * 4. If arr[i] + arr[j] == targetSum, print the pair.
         */

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                // Check if sum of current pair equals targetSum
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
/*
 * arr = [2,4,3,5,7,8,9], targetSum = 10
 * 
 * i = 0 → arr[i] = 2
 * j = 1 → 2+4=6 ≠ 10 → skip
 * j = 2 → 2+3=5 ≠ 10 → skip
 * j = 3 → 2+5=7 ≠ 10 → skip
 * j = 4 → 2+7=9 ≠ 10 → skip
 * j = 5 → 2+8=10 → print (2,8)
 * j = 6 → 2+9=11 → skip
 * 
 * i = 1 → arr[i] = 4
 * j = 2 → 4+3=7 → skip
 * j = 3 → 4+5=9 → skip
 * j = 4 → 4+7=11 → skip
 * j = 5 → 4+8=12 → skip
 * j = 6 → 4+9=13 → skip
 * 
 * i = 2 → arr[i] = 3
 * j = 3 → 3+5=8 → skip
 * j = 4 → 3+7=10 → print (3,7)
 * j = 5 → 3+8=11 → skip
 * j = 6 → 3+9=12 → skip
 * 
 * i = 3 → arr[i] = 5
 * j = 4 → 5+7=12 → skip
 * j = 5 → 5+8=13 → skip
 * j = 6 → 5+9=14 → skip
 * 
 * i = 4 → arr[i] = 7
 * j = 5 → 7+8=15 → skip
 * j = 6 → 7+9=16 → skip
 * 
 * i = 5 → arr[i] = 8
 * j = 6 → 8+9=17 → skip
 * 
 * i = 6 → arr[i] = 9 → no j left
 * 
 * Output pairs: (2,8), (3,7)
 * 
 * Pairs with sum 10:
 * (2, 8)
 * (3, 7)
 * 
 */