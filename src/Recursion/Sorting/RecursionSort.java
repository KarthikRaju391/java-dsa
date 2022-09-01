package Recursion.Sorting;

import java.util.Arrays;

public class RecursionSort {
    public static void main(String[] args) {
       int[] nums = {3, 2, 5, 1, 4};
//       sort2(nums, nums.length - 1, 0, 0);
       insertSort(nums, 0, 0, 1);
       System.out.println(Arrays.toString(nums));
    }

    static void insertSort(int[] arr, int a, int row, int col) {
        if(row == arr.length - 1) {
            return;
        }

        if(col > a) {
            if(arr[col] < arr[col - 1]) {
                swap(arr, col, col - 1);
            }
            insertSort(arr, a, row, col - 1);
        } else {
            insertSort(arr, a, row + 1, row + 2);
        }
    }
    static void sort2(int[] arr, int row, int col, int maxIndex) {
        if(row == 0) {
            return;
        }

        if(col <= row) {
            if(arr[col] > arr[maxIndex]) {
                maxIndex = col;
            }
            sort2(arr, row, col+1, maxIndex);
        } else {
            swap(arr, maxIndex, row);
            sort2(arr, row - 1, 0, 0);
        }
    }

    static void sort(int[] arr, int row, int col) {
        if(row == 0) {
            return;
        }
        if(col < row) {
            if (arr[col] >= arr[col + 1]) {
                swap(arr, col, col + 1);
            }
            sort(arr, row, col + 1);
        }
        else {
            sort(arr, row - 1, 0);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
