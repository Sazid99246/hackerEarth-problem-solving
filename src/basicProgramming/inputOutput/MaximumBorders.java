package basicProgramming.inputOutput;

import java.util.Scanner;

public class MaximumBorders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            char[][] grid = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                grid[i] = scanner.nextLine().toCharArray();
            }

            System.out.println(findMaxBorder(grid, rows, cols));
        }

        scanner.close();
    }

    private static int findMaxBorder(char[][] grid, int rows, int cols) {
        int maxBorder = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '#') {
                    int rowBorder = 0;
                    int colBorder = 0;

                    // Count consecutive black cells in the row
                    for (int k = j; k < cols && grid[i][k] == '#'; k++) {
                        rowBorder++;
                    }

                    // Count consecutive black cells in the column
                    for (int k = i; k < rows && grid[k][j] == '#'; k++) {
                        colBorder++;
                    }

                    maxBorder = Math.max(maxBorder, Math.max(rowBorder, colBorder));
                }
            }
        }

        return maxBorder;
    }
}
