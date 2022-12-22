package Recursion.StringsAndSubsequence;

import java.util.Arrays;

public class WildcardMatching {
    // Q: Given two strings s1 and s2, and s1 includes wildcard characters like '*' and '?'
    // where '*' can match with 0 or more characters and '?' can match with only 1 character
    // The task is to check if the two strings can be matched

    public static void main(String[] args) {
       String s1 = "c*a*b";
       String s2 = "aab";

       int n = s1.length();
       int m = s2.length();

       boolean[][] dp = new boolean[n+1][m+1];
//       boolean[][] dp = new boolean[n][m];
//       System.out.println(checkIfMatch(n-1, m-1, s1, s2, dp));
       System.out.println(checkIfMatchAlt(s1, s2));
//        System.out.println(wildcardMatching(s1, s2));
    }

    static boolean checkIfMatch(int i, int j, String pattern, String text, boolean[][] dp) {
        // base cases

        // If both the strings are exhausted
        if(i < 0 && j < 0) {
            return true;
        }

        // If the pattern is exhausted
        if(i < 0 && j >= 0) {
            return false;
        }

        // If the text is exhausted but pattern is not
        if(j < 0 && i >= 0) {
            // Check if the pattern left is just '*'
            for(int k = 0; k <= i; k++) {
                if(pattern.charAt(k) != '*') {
                   return false;
                }
            }
            return true;
        }

        if(dp[i][j]) {
            return true;
        }
        // recursive calls
        if(pattern.charAt(i) == text.charAt(j) || pattern.charAt(i) == '?') {
            return dp[i][j] = checkIfMatch(i-1, j-1, pattern, text, dp);
        }
        if(pattern.charAt(i) == '*') {
            return dp[i][j] = checkIfMatch(i, j-1, pattern, text, dp) || checkIfMatch(i-1, j, pattern, text, dp);
        }

        return false;
    }

    static boolean checkIfMatchAlt(String pattern, String text) {

        int n = pattern.length();
        int m = text.length();

        boolean dp[][] = new boolean[n + 1][m + 1];
        // converting the base cases
        dp[0][0] = true;

        for(int j = 1; j <= m; j++) {
            dp[0][j] = false;
        }

        for(int i = 1; i <= n; i++) {
            boolean flag = true;
            for(int k = 1; k <= i; k++) {
                if(pattern.charAt(k-1) != '*') {
                    flag = false;
                    break;
                }
            }
            dp[i][0] = flag;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(pattern.charAt(i-1) == text.charAt(j-1) || pattern.charAt(i-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(pattern.charAt(i-1) == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
    }
}
