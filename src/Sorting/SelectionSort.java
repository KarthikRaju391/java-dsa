package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = findMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int findMax(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
