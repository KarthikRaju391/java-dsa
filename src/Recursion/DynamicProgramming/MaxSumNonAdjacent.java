package Recursion.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumNonAdjacent {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(maximumNonAdjacentSum(n - 1, arr, dp));
    }

    static int maximumNonAdjacentSum(int index, int[] nums, int[] dp) {
        if(index == 0) return nums[index];
        if(index < 0) return 0;
        if(dp[index] != -1) return dp[index];
        int pick = nums[index] + maximumNonAdjacentSum(index - 2, nums, dp);
        int notPick = maximumNonAdjacentSum(index - 1, nums, dp);

        return dp[index] = Math.max(pick, notPick);
    }

    //tabulated form with

    static int maxAlt(int index, int[] nums, int[] dp) {
        dp[0] = 0;
        //Todo: check the loop variables
        for(int i = 1; i < index; i++) {
            int pick = nums[index];
            if(i > 1)
                pick += dp[i-2];

            int nonPick = dp[i-1];

            dp[i] = Math.max(pick, nonPick);
        }
        return dp[index-1];
    }

    static int maxAdjSpcOpt(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;

        for(int i = 1; i < n; i++) {
            int take = nums[i];
            if(i > 1) take += prev2;

            int notTake = prev;

            int curi = Math.max(take, notTake);
            prev2 = prev;
            prev = curi;
        }

        return prev;
    }

    // Todo: solve this again
//    static long houseRobber(int[] valueInHouse) {
//        int n = valueInHouse.length;
//        List<Integer> temp1 = new ArrayList<>();
//        List<Integer> temp2 = new ArrayList<>();
//
//        if(n == 1) return valueInHouse[0];
//
//        for(int i = 0; i < n; i++) {
//            if(i != 0) temp1.add(valueInHouse[i]);
//            if(i != n-1) temp2.add(valueInHouse[i]);
//        }
//
//        return Math.max(maxAdjSpcOpt(temp1), maxAdjSpcOpt(temp2));
//    }
}




