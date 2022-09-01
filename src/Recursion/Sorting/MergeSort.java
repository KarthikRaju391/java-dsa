package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 2};
        nums = sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] sort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] res = new int[first.length + second.length];

        while(i < first.length && j < second.length) {
            if(first[i] > second[j]) {
                res[k] = second[j];
                j++;
            } else {
                res[k] = first[i];
                i++;
            }
            k++;
        }

        while(i < first.length) {
            res[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length) {
            res[k] = second[j];
            j++;
            k++;
        }

        return res;
    }
}
