package Recursion.DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {
                {5, 9, 6},
                {11, 5, 2}
        };
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findMinPath(m-1, n-1, dp, grid));
    }
    static int findMinPath(int row, int col, int[][]dp, int[][] grid) {
        if(row == 0 && col == 0) {
            return grid[0][0];
        }
        if(row < 0 || col < 0) {
            return (int)Math.pow(10, 9); // Returning a maximum value
        }
        if(dp[row][col] != -1) return dp[row][col];

        int up = grid[row][col] + findMinPath(row - 1, col, dp, grid);
        int left = grid[row][col] + findMinPath(row, col - 1, dp, grid);

        return dp[row][col] = Math.min(up, left);
    }


    static int findMinTab(int m, int n, int[][] dp, int[][]grid) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) dp[i][j] = grid[i][j];
                else {
                    int up = (int)Math.pow(10,9);
                    int left = (int)Math.pow(10,9);
                    if(i > 0) up = grid[i][j] + dp[i - 1][j];
                    if(j > 0) left = grid[i][j] + dp[i][j - 1];

                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
