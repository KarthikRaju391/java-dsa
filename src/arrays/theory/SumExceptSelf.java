package arrays.theory;

import java.util.Arrays;

public class SumExceptSelf {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(input)));
    }

    static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];
        int prefixSum = 1;
        int suffixSum = 1;
        for(int i=0;i<n;i++) {
            answer[i] = prefixSum;
            prefixSum *= nums[i];
        }

        for(int i=n-1;i>=0;i--) {
            answer[i] *= suffixSum;
            suffixSum *= nums[i];
        }
        return answer;
    }
}
