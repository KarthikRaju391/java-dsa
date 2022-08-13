package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {-6, 4, 0, -8, 9};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] arr) {
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    swap(j-1, j, arr);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }

    static void swap(int num1, int num2, int[] arr) {
       int temp = arr[num1];
       arr[num1] = arr[num2];
       arr[num2] = temp;
    }
}
