package Backtracking;

public class sudokusolver {

    static final int N = 9;

    // ----------------------------------------------------
    // FUNCTION: Print the solved Sudoku grid
    // ----------------------------------------------------
    // Prints the Sudoku grid in a clean 3×3 block format
    static void printGrid(int grid[][]) {

        /*
         * DRY RUN EXPLANATION
         * --------------------
         * Suppose N = 9 and grid looks like:
         * 
         * 5 3 0 | 0 7 0 | 0 0 0
         * 6 0 0 | 1 9 5 | 0 0 0
         * 0 9 8 | 0 0 0 | 0 6 0
         * -----------------------
         * 8 0 0 | 0 6 0 | 0 0 3
         * 4 0 0 | 8 0 3 | 0 0 1
         * 7 0 0 | 0 2 0 | 0 0 6
         * -----------------------
         * 0 6 0 | 0 0 0 | 2 8 0
         * 0 0 0 | 4 1 9 | 0 0 5
         * 0 0 0 | 0 8 0 | 0 7 9
         * 
         * HOW PRINTING WORKS:
         * --------------------
         * r — row index (0–8)
         * d — column index (0–8)
         * 
         * Every 3 rows → print a horizontal separator line
         * Every 3 columns → print a vertical separator "|"
         * 
         * Example:
         * r = 0:
         * (r+1)%3 != 0 → print leading space
         * d = 0 → print grid[0][0] = 5
         * d = 2 → after printing 3rd number → print "|"
         * 
         * When r = 2:
         * (2+1)%3 == 0 → print "|-----------------------|"
         * This forms the horizontal block divider.
         */

        for (int r = 0; r < N; r++) {

            // Print horizontal separator after every 3 rows
            if ((r + 1) % 3 == 0) {
                System.out.print("|-----------------------|\n");
            } else {
                System.out.print(" ");
            }

            // Print each cell in row
            for (int d = 0; d < N; d++) {

                // Print the grid value
                System.out.print(grid[r][d] + " ");

                // Print vertical separator after every 3 columns
                if ((d + 1) % 3 == 0)
                    System.out.print("| ");
                else
                    System.out.print(" ");
            }

            System.out.println(); // Move to next line
        }
    }

    // ----------------------------------------------------
    // FUNCTION: Check if placing 'num' at (row, col) is safe
    // ----------------------------------------------------
    static boolean isSafe(int[][] grid, int row, int col, int num) {

        // ---- Check entire row ----
        for (int x = 0; x < N; x++)
            if (grid[row][x] == num)
                return false;

        // ---- Check entire column ----
        for (int x = 0; x < N; x++)
            if (grid[x][col] == num)
                return false;

        // ---- Check the 3x3 sub-grid ----
        int startRow = row - row % 3; // starting row of the sub-grid
        int startCol = col - col % 3; // starting col of the sub-grid

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[startRow + i][startCol + j] == num)
                    return false;

        return true; // Safe to place number
    }

    // ----------------------------------------------------
    // FUNCTION: Solve Sudoku using Backtracking
    // ----------------------------------------------------
    static boolean solveSudoku(int[][] grid) {

        // STEP 1: Find an EMPTY cell (marked as 0)
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {

                if (grid[row][col] == 0) {

                    // STEP 2: Try placing digits 1 to 9
                    for (int num = 1; num <= 9; num++) {

                        // Check if num is allowed here
                        if (isSafe(grid, row, col, num)) {

                            // Place number
                            grid[row][col] = num;

                            // Recur – If next cell leads to solution, return true
                            if (solveSudoku(grid))
                                return true;

                            // Otherwise BACKTRACK → remove the number
                            grid[row][col] = 0;
                        }
                    }

                    // If no number 1–9 fits → return false
                    return false;
                }
            }
        }

        // If no empty cell remains → Sudoku solved
        return true;
    }

    // ----------------------------------------------------
    // DRY RUN (EXPLAINED)
    // ----------------------------------------------------
    /*
     * DRY RUN OF SOLVER (Initial Steps Only)
     * 
     * Consider the first row in the grid:
     * 
     * Row 0: 5 3 0 0 7 0 0 0 0
     * 
     * First empty cell = (0,2)
     * 
     * Try num = 1:
     * - Check row → OK
     * - Check column → OK
     * - Check 3x3 block → OK
     * → Place 1 at (0,2)
     * 
     * Grid becomes:
     * 5 3 1 0 7 0 0 0 0
     * 
     * Now solver moves to next empty cell (0,3)
     * 
     * Try num = 1:
     * - Row has 1 → Not allowed
     * Try num = 2:
     * - Row OK, Column OK, Block OK → Place 2
     * 
     * Grid:
     * 5 3 1 2 7 0 0 0 0
     * 
     * Next empty → (0,5)
     * 
     * Try num = 1..6 → All INVALID
     * Try num = 7 → invalid (already in row)
     * Try num = 8 → OK
     * 
     * Place 8:
     * 5 3 1 2 7 8 0 0 0
     * 
     * If later wrong numbers appear,
     * BACKTRACKING removes them and tries new ones.
     * 
     * Example of backtracking:
     * Suppose at some point grid becomes stuck.
     * The algorithm removes last placed number:
     * 
     * grid[row][col] = 0;
     * 
     * And tries the next number.
     * 
     * This continues until the entire grid is solved.
     */

    // ----------------------------------------------------
    // MAIN FUNCTION
    // ----------------------------------------------------
    public static void main(String[] args) {

        // Input Sudoku Puzzle
        int[][] grid = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        if (solveSudoku(grid))
            printGrid(grid);
        else
            System.out.println("No solution exists");
    }
}
