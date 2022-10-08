package Recursion.DynamicProgramming;

import java.util.HashMap;

public class FrogJump {
    public static void main(String[] args) {
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        int[] DP = new int[stones.length];
    }
    static int findPath(int index, int[] stones, int[] DP) {
        if(index == 0) {
            return 0;
        }
        if(DP[index] != -1) return DP[index];
        int left = findPath(index - 1, stones, DP) + Math.abs(stones[index] - stones[index-1]);
        int right = Integer.MAX_VALUE;
        if(index > 1) right = findPath(index - 1, stones, DP) + Math.abs(stones[index] - stones[index - 2]);

        return DP[index] = Math.min(left, right);
    }

    static int findPathDP(int n, int[] stones) {
        int[] dp = new int[stones.length];

        dp[0] = 0;

        for(int i = 1; i < n; i++) {
            int fs = dp[i-1] + Math.abs(stones[i] - stones[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1) {
                ss = dp[i-2] + Math.abs(stones[i] - stones[i - 2]);
            }

            dp[i] = Math.min(fs, ss);
        }
        return dp[n - 1];
    }

    static int findPathSpaceOptimized(int n, int[] stones) {
        int prev = 0;
        int prev2 = 0;

        for(int i = 1; i < n; i++) {
            int fs = prev + Math.abs(stones[i] - stones[i - 1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1) {
                ss = prev2 + Math.abs(stones[i] - stones[i - 2]);
            }

            int curi = Math.min(fs, ss);
            prev2 = prev;
            prev = curi;
        }

        return prev;
    }
}
