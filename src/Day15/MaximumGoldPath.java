package Day15;

import java.util.Arrays;

public class
        MaximumGoldPath {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1, 5},
                {2, 2, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 1, 2}
        };

        int maxGold = getMaxGold(grid);
        System.out.println("Maximum gold collected: " + maxGold);
    }

    public static int getMaxGold(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        for (int[] row : dp) {
            Arrays.fill(row, -1); // Initialize with -1 (not visited)
        }

        int maxGold = 0;
        for (int i = 0; i < rows; i++) {
            maxGold = Math.max(maxGold, collectGold(grid, i, 0, rows, cols, dp));
        }
        return maxGold;
    }

    private static int collectGold(int[][] grid, int x, int y, int rows, int cols, int[][] dp) {
        if (x < 0 || x >= rows || y == cols) {
            return 0;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        int right = collectGold(grid, x, y + 1, rows, cols, dp);
        int rightUpperDiagonal = collectGold(grid, x - 1, y + 1, rows, cols, dp);
        int rightLowerDiagonal = collectGold(grid, x + 1, y + 1, rows, cols, dp);

        dp[x][y] = grid[x][y] + Math.max(Math.max(rightUpperDiagonal, rightLowerDiagonal), right);
        return dp[x][y];
    }
}
