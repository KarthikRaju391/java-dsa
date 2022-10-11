package Recursion.Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] nums = {8, 4, 1, 3, 5, 2, 7};
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }


    static void mergeSort(int[] arr, int s, int e) {
        if(e - s == 1) {
            return;
        }
        int m = s + (e - s)/ 2;

        mergeSort(arr, s, m);
        mergeSort(arr, m, e);

        mergeAlt(arr, s, m, e);
    }

    static void mergeAlt(int[] arr, int s, int m, int e) {
        int start1 = s;
        int start2 = m;

        while(start1 <= m && start2 <= e) {
           if(arr[start1] < arr[start2]) {
               start1++;
           } else {
               int value = arr[start2];
               int index = start2;
               while(index != start1) {
                   arr[index] = arr[index - 1];  // Rotating the elements from right to left
                   index--;
               }
               arr[start1] = value;

               start1++;
               start2++;
               m++;
           }
        }
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
