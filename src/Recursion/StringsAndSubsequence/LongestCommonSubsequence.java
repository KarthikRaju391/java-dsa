package Recursion.StringsAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s = "acd";
        String t = "ced";
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m][n];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
//        System.out.println(findSequenceMemoized(m-1, n-1, s , t, dp));
        System.out.println(findSequenceTabulated(s, t));
    }

    static int findSequence(int i, int j, String s, String t) {
        if(i < 0 || j < 0) {
            return 0;
        }

        if(s.charAt(i) == t.charAt(j)) {
            return 1 + findSequence(i - 1, j -1, s, t);
        }

        return Math.max(findSequence(i, j - 1, s, t), findSequence(i - 1, j, s, t));
    }

    static int findSequenceMemoized(int i, int j, String s, String t, int[][]dp) {
        if(i < 0 || j < 0) {
            return 0;
        }

        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == t.charAt(j)) {
           return dp[i][j] = 1 + findSequenceMemoized(i - 1, j - 1, s, t, dp);
        }

        return dp[i][j] = Math.max(findSequenceMemoized(i, j-1, s, t, dp), findSequenceMemoized(i-1,j,s,t,dp));
    }

    static int findSequenceTabulated(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m+1][n+1];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }

        for(int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
