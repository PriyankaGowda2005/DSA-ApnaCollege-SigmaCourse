package Backtracking;

public class gridWays {

    // Function to count the total number of ways to reach (m-1, n-1)
    public static int countWays(int m, int n) {

        // Create a DP table of size m x n
        int[][] dp = new int[m][n];

        // There is only ONE way to reach any cell in the FIRST COLUMN
        // (only move DOWN)
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // There is only ONE way to reach any cell in the FIRST ROW
        // (only move RIGHT)
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill the rest of the table
        // dp[i][j] = ways from TOP (dp[i-1][j]) + ways from LEFT (dp[i][j-1])
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // Return bottom-right corner cell
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int m = 4, n = 3;
        System.out.println("Total ways: " + countWays(m, n)); // Output: 6
    }
}
