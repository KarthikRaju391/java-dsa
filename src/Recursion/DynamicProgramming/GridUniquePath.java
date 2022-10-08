package Recursion.DynamicProgramming;

import java.util.Arrays;

public class GridUniquePath {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int[][] dp = new int[m][n];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(findAllPathsOptimized(m, n, dp));
    }

    // Recursive Solution
    static int findAllPaths(int row, int col, int[][] dp) {
       if(row == 0 && col == 0) {
           return 1;
       }
       if(row < 0 || col < 0) {
           return 0;
       }
       if(dp[row][col] != -1) {
           return dp[row][col];
       }

       int up = findAllPaths(row - 1, col, dp);
       int left = findAllPaths(row, col - 1, dp);

       return dp[row][col] = up + left;
    }

    static int findAllPathsOptimized(int m, int n, int[][] dp) {

        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {

                if(row == 0 && col == 0) {
                   dp[row][col] = 1;
                   continue;
                }

                int up = 0;
                int left = 0;

                if(row > 0) up = dp[row - 1][col];
                if(col > 0) left = dp[row][col - 1];

                dp[row][col] = up + left;
            }
        }
        return dp[m-1][n-1];
    }
}
