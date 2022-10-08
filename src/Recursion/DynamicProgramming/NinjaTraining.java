package Recursion.DynamicProgramming;

import java.util.Arrays;

public class NinjaTraining {
    public static void main(String[] args) {
        int[][] points = {
                {10,40,70},
                {20,50,80},
                {30,60,90}
        };

        int[][] dp = new int[points.length][4];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(solve(points.length-1, 3, points, dp));

        System.out.println(solveAlt(points.length, points));

        System.out.println(solveMaxAlt(points.length, points));
    }

    static int solve(int day, int last, int[][] points, int[][] dp) {

        if(dp[day][last] != -1) return dp[day][last];

        // when it is the final day, we just select the maximum out of the two choices
        // we have only two choices because ninja cannot perform the same task which was performed
        // the previous day!
        if(day == 0) {
            int maxi = 0;
            for(int task = 0; task < 3; task++) {
                if(task != last) {
                    maxi = Math.max(maxi, points[0][task]);
                }
            }
            return dp[day][last] = maxi;
        }

        int maxi = 0;
        for(int task = 0; task < 3; task++) {
            if(task != last) {
                int point = points[day][task] + solve(day-1, task, points, dp);
                maxi = Math.max(maxi, point);
            }
        }
        return dp[day][last] = maxi;
    }

    static int solveAlt(int n, int[][] points) {
        int[][] dp = new int[n][4];
//        for (int[] arr : dp) {
//            Arrays.fill(arr, -1);
//        }

        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        for(int day = 1; day < n; day++) {
            for(int last = 0; last < 4; last++) {
                dp[day][last] = 0;

                for(int task = 0; task < 3; task++) {
                    if(task != last) {
                        int point = points[day][task] + dp[day-1][task];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }
        return dp[n-1][3];
    }

    static int solveMaxAlt(int n, int[][] points) {
        int[] dp = new int[4];

        dp[0] = Math.max(points[0][1], points[0][2]);
        dp[1] = Math.max(points[0][0], points[0][2]);
        dp[2] = Math.max(points[0][0], points[0][1]);
        dp[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        for(int day = 1; day < n; day++) {
            int[] temp = new int[4];
            for(int last = 0; last < 4; last++) {
                temp[last] = 0;
                for(int task = 0; task < 3; task++) {
                    if(task != last) {
                        temp[last] = Math.max(temp[last], points[day][task] + dp[task]);
                    }
                }
            }
            dp = temp;
        }
        return dp[3];
    }
}
