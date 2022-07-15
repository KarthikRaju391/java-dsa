package arrays.theory;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 50, 2, 90};

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] numarr) {
        int start = 0;
        int end = numarr.length - 1;
        while(start < end) {
            swap(numarr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
