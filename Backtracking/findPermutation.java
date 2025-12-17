package Backtracking;

public class findPermutation {
    public static void findPermutations(String str, String curr, boolean[] used) {
        if (curr.length() == str.length()) { // Base case: permutation complete
            System.out.println(curr);
            return;
        }
        // Explore permutations by adding unused characters
        for (int i = 0; i < str.length(); i++) { // Iterate through characters
            if (used[i])
                continue; // Skip used characters

            used[i] = true; // Mark character as used
            findPermutations(str, curr + str.charAt(i), used); // Recurse with updated permutation
            used[i] = false; // Backtrack: unmark character for next iterations
        }
        // End of for loop
    }

    public static void main(String[] args) {
        String str = "ABC";
        boolean[] used = new boolean[str.length()];
        findPermutations(str, "", used);
    }
}
// Time Complexity: O(n! * n) where n is the length of the string
// Space Complexity: O(n) for the recursion stack and used array
// Example Output for "ABC":
// ABC
// ACB
// BAC
// BCA
// CAB
// CBA
/*
 * Explanation:
 * The function findPermutations generates all permutations of the input string
 * by using backtracking.
 * It maintains a boolean array 'used' to track which characters have been
 * included in the current permutation.
 * When the current permutation reaches the length of the original string, it is
 * printed.
 * The function explores all possible characters for each position in the
 * permutation, marking them as used and backtracking as necessary.
 */
