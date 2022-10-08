package Recursion.DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int[] dp = new int[4];
        Arrays.fill(dp, -1);
        int res = countStairMem(3, dp);
        System.out.println(res);
    }

    static int countStairs(int n, int total) {
        if (n == total) {
            return 1;
        }
        if (n == total - 1) {
            return 1;
        }

        return countStairs(n + 1, total) + countStairs(n + 2, total);
    }

    static int countStairAlt(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return countStairAlt(n - 1) + countStairAlt(n - 2);
    }

    // memoized
    static int countStairMem(int n, int[] dp) {
        if (n <= 1) {
            return 1;
        }

        if (dp[n] != -1) return dp[n];

        return dp[n] = countStairMem(n - 1, dp) + countStairMem(n - 2, dp);
    }
}
    // tabulation method -> Space optimized

//    static int countStairsTab(int n) {
//        int prev2 = 1;
//        int prev = 1;
//        for(int i = 2; i <= n; i++) {
//            int curi = prev + prev2;
//            prev = curi;
//            prev2 = prev;
//        }
//
//        return prev;
//    }
//}
