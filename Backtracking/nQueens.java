package Backtracking;

public class nQueens {

    static int N = 4; // Size of the chessboard

    // Function to print the solution matrix
    static void printSolution(int board[][]) {
        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(" " + board[r][d] + " ");
            }
            System.out.println();
        }
    }

    // Check if placing a queen at board[row][col] is safe
    static boolean isSafe(int board[][], int row, int col) {

        int i, j;

        // 1. Check this row on the left side
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        // 2. Check upper-left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // 3. Check lower-left diagonal
        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true; // Safe position
    }

    // Recursive utility function to solve N-Queens problem
    static boolean solveNQUtil(int board[][], int col) {

        // Base Case: All queens are placed
        if (col >= N) {
            return true;
        }

        // Try placing a queen in all rows in this column
        for (int i = 0; i < N; i++) {

            // Check if queen can be placed at board[i][col]
            if (isSafe(board, i, col)) {

                board[i][col] = 1; // Place queen

                // Recur to place the rest of the queens
                if (solveNQUtil(board, col + 1))
                    return true;

                // BACKTRACK — remove the queen
                board[i][col] = 0;
            }
        }

        return false; // No safe place found
    }

    // Main function to trigger the algorithm
    public static void nQueen() {

        int board[][] = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };

        if (!solveNQUtil(board, 0)) {
            System.out.println("Solution does not exist");
            return;
        }

        // Print the solution
        printSolution(board);
    }

    // To run the program
    public static void main(String[] args) {
        nQueen();
    }
}
/*
 * Time Complexity: O(N!), as we are trying to place N queens on an N x N board
 * and for each queen, we have N choices initially, then N-1, and so on.
 * Space Complexity: O(N^2) for the chessboard representation.
 * Explanation:
 * The nQueens class implements a solution to the N-Queens problem using
 * backtracking.
 * It defines a chessboard of size N x N and attempts to place N queens such
 * that no two queens threaten each other.
 * The isSafe function checks if a queen can be placed at a given position
 * without being attacked.
 * The solveNQUtil function uses recursion to place queens column by column,
 * backtracking when necessary.
 * If a solution is found, the board configuration is printed; otherwise, a
 * message indicating no solution
 * is printed.
 * Example Output for N=4:
 * 0 1 0 0
 * 0 0 0 1
 * 1 0 0 0
 * 0 0 1 0
 * This output represents one of the valid configurations for placing 4 queens
 * on a 4x4 chessboard.
 */