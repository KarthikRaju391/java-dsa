package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        int s = low;
        int e = high;
        int pivot = s + (e - s) / 2;

        if(low >= high) {
            return;
        }

        while(s <= e) {
            while(nums[s] < nums[pivot]) {
                s++;
            }
            while(nums[e] > nums[pivot]) {
                e--;
            }

            if(s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        sort(nums, low, e);
        sort(nums, s, high);
    }
}
