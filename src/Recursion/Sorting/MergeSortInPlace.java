package Recursion.Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 2};
        mergeSort(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }


    static void mergeSort(int[] arr, int s, int e) {
        if(e - s == 1) {
            return;
        }
        int m = (s + e) / 2;

        mergeSort(arr, s, m);
        mergeSort(arr, m, e);

        merge(arr, s, m, e);
    }
    static void merge(int[] arr, int s, int m, int e) {
        int[] res = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e) {
            if(arr[i] > arr[j]) {
                res[k] = arr[j];
                j++;
            } else {
                res[k] = arr[i];
                i++;
            }
            k++;
        }

        while(i < m) {
            res[k] = arr[i];
            i++;
            k++;
        }

        while(j < e) {
            res[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < res.length; l++) {
            arr[s + l] = res[l];
        }
    }
}
