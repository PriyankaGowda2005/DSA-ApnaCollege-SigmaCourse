package Backtracking;

public class nQueen {

    static int N = 5; // Size of board
    static int solutionCount = 1; // To number each solution

    // Print one solution matrix
    static void printSolution(int board[][]) {
        System.out.println("Solution " + solutionCount++ + ":");
        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(" " + board[r][d] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if placing a queen at (row, col) is safe
    static boolean isSafe(int board[][], int row, int col) {

        int i, j;

        // Check row on left side
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper-left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower-left diagonal
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Recursively place queens column by column
    static void solveAllSolutions(int board[][], int col) {

        // Base case: All queens are placed → print solution
        if (col == N) {
            printSolution(board);
            return;
        }

        // Try all rows for this column
        for (int i = 0; i < N; i++) {

            // Check if the queen can be placed here
            if (isSafe(board, i, col)) {
                board[i][col] = 1; // Place queen

                solveAllSolutions(board, col + 1); // Recur

                board[i][col] = 0; // Backtrack
            }
        }
    }

    public static void nQueen() {

        int board[][] = {
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };

        solveAllSolutions(board, 0);
    }

    public static void main(String[] args) {
        nQueen();
    }
}
