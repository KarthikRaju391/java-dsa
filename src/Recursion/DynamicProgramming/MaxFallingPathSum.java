package Recursion.DynamicProgramming;

import java.util.Arrays;

public class MaxFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 1, 10},
                {1, 100, 2},
                {3, 1, 2}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

//        int maxi = 0;
//        for(int i = 0; i < n; i++) {
////           maxi = Math.max(maxi, findMaxPath(m-1, i, matrix, m, n));
//             maxi = Math.max(maxi, findMaxPathMem(m - 1, i, matrix, dp));
//        }
//        System.out.println(maxi);

//        System.out.println(findMaxPathTab(matrix, m, n, dp));
        System.out.println(findMaxPathTabOpt(matrix));
    }

    // Recursive approach
    static int findMaxPath(int i, int j, int[][] matrix, int m, int n) {
        if(j < 0 || j >= m) {
            return 0;
        }
        if(i == 0) {
            return matrix[i][j];
        }

        int s = matrix[i][j] + findMaxPath(i - 1, j, matrix, m, n);
        int ld = matrix[i][j] + findMaxPath(i - 1, j - 1, matrix, m, n);
        int rd = matrix[i][j] + findMaxPath(i - 1, j + 1, matrix, m, n);

        return Math.max(s, Math.max(ld, rd));
    }

    // Memoized recursive approach

    static int findMaxPathMem(int i, int j, int[][] matrix, int[][] dp) {
        if(j < 0 || j >= matrix.length) {
            return 0;
        }
        if(i == 0) {
            return matrix[i][j];
        }

        if(dp[i][j] != -1) return dp[i][j];

        int s = matrix[i][j] + findMaxPathMem(i - 1, j, matrix, dp); // up
        int ld = matrix[i][j] + findMaxPathMem(i - 1, j - 1, matrix, dp); // left diagonal
        int rd = matrix[i][j] + findMaxPathMem(i - 1, j + 1, matrix, dp); // right diagonal

        return dp[i][j] = Math.max(s, Math.max(ld, rd));
    }

    // Tabulated (bottom up) approach

    static int findMaxPathTab(int[][] matrix, int m, int n, int [][] dp) {
        // Base cases
        for(int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i];
        }

        for(int i = 1; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int s = matrix[i][j] + dp[i - 1][j]; // up

                int ld = 0;
                int rd = 0;

                if(j - 1 >= 0) {
                    ld = matrix[i][j] + dp[i - 1][j - 1]; // left diagonal
                }
                if(j + 1 < m) {
                    rd = matrix[i][j] + dp[i - 1][j + 1]; // right diagonal
                }

                dp[i][j] = Math.max(s, Math.max(ld, rd));
            }
        }

        int maxi = dp[m - 1][0];
        for(int j = 1; j < n; j++) {
            maxi = Math.max(maxi, dp[m - 1][j]);
        }
        return maxi;
    }

    // Space optimized approach
    static int findMaxPathTabOpt(int[][] matrix) {
        int[] prev = new int[matrix[0].length];
        int[] curr = new int[matrix[0].length];

        for(int i = 0; i < matrix[0].length; i++) {
            prev[i] = matrix[0][i];
        }

        for(int i = 1; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                int s = matrix[i][j] + prev[j];

                int ld = 0;
                int rd = 0;

                if(j - 1 >= 0) {
                    ld += matrix[i][j] + prev[j - 1];
                }
                if(j + 1 < matrix.length) {
                    rd += matrix[i][j] + prev[j + 1];
                }

                curr[j] = Math.max(s, Math.max(ld, rd));
            }
            prev = Arrays.copyOfRange(curr, 0, curr.length);
        }

        int maxi = 0;
        for(int i = 0; i < matrix[0].length; i++) {
            maxi = Math.max(maxi, prev[i]);
        }
        return maxi;
    }
}
