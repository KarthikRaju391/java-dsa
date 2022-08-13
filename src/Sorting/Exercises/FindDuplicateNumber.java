package Sorting.Exercises;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 3, 2};
        System.out.println(find(nums));
        System.out.println(Arrays.toString(nums));
    }

    static int find(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] - 1 != j) {
                return arr[j];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
