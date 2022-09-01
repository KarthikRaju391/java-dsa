package Recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumTriangle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sumTriangle(int[] nums) {
        if(nums.length == 1) {
            return;
        }
        // perform adjacent element addition
        int[] newArr = new int[nums.length-1];
        for(int i = 0; i < nums.length - 1; i++) {
            int res = nums[i] + nums[i+1];
            newArr[i] = res;
        }
        sumTriangle(newArr);
        System.out.println(Arrays.toString(newArr));
    }
}
