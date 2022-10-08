package Recursion.DynamicProgramming;

import java.util.Arrays;

public class TriangleMinPath {
    public static void main(String[] args) {
        int[][] triangle = {
                {1, -1, -1, -1},
                {1, 2, -1, -1},
                {3, 4, 1, -1},
                {7, 6, 2, 5}
        };

        int m = triangle.length;
        int n = triangle[0].length;

        int[][] dp = new int[m][n];

        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }

//        System.out.println(findMinPathTriangle(0, 0, dp, triangle));
//        System.out.println(findMinPathTriangleTab(n, triangle));
        System.out.println(findMinPathTriangleSpaceOptimized(triangle, n));
    }

    // consider the triangle length if given
    static int findMinPathTriangle(int row, int col, int[][] dp, int[][] triangle) {
        if(row == triangle.length - 1) {
            return triangle[row][col];
        }
        if(dp[row][col] != -1) return dp[row][col];

        int down = triangle[row][col] + findMinPathTriangle(row + 1, col, dp, triangle);
        int diagonal = triangle[row][col] + findMinPathTriangle(row + 1, col + 1, dp, triangle);

        return dp[row][col] = Math.min(down, diagonal);
    }

    static int findMinPathTriangleTab(int m, int[][] triangle) {
        int[][] dp = new int[m][m];

        for(int k = 0; k < m; k++) {
            dp[m - 1][k] = triangle[m - 1][k];
        }

        for(int i = m - 2; i >= 0; i--) {
            for(int j = i; j >= 0; j--) {
                int down = triangle[i][j] + dp[i+1][j];
                int diagonal = triangle[i][j] + dp[i+1][j+1];
                dp[i][j] = Math.min(down, diagonal);
            }
        }
        return dp[0][0];
    }

    static int findMinPathTriangleSpaceOptimized(int[][] triangle, int m) {
        int[] front = new int[m];
        int[] cur = new int[m];

        for(int k = 0; k < m; k++) {
            front[k] = triangle[m - 1][k];
        }

        for(int i = m - 2; i >= 0; i--) {
            for(int j = i; j >= 0; j--) {
                int down = triangle[i][j] + front[j];
                int diagonal = triangle[i][j] + front[j+1];
                cur[j] = Math.min(down, diagonal);
            }
            front = cur;
        }
        return front[0];
    }
}
