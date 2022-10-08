package arrays;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int i = 0;

        while(i <= e) {
            if(nums[i] == 0) {
                swap(nums, i++, s++);
            }
            else if(nums[i] == 2) {
                swap(nums, i, e--);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
