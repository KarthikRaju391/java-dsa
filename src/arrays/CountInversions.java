package arrays;

import java.util.Arrays;

public class CountInversions {
    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 4, 1};
        int n = nums.length;
        int[] temp = new int[n];
        int res = sort(nums, temp, 0, nums.length - 1);
        System.out.println(res);
    }

    static int sort(int[] arr, int[] temp, int s, int e) {
        int mid, inv_count = 0;
        if(e > s) {
            mid = (s + e) / 2;

            inv_count += sort(arr, temp, s, mid);
            inv_count += sort(arr, temp, mid+1, e);

            inv_count += merge(arr, temp, s, mid + 1, e);
        }
        return inv_count;
    }

    static int merge(int[] arr, int[] temp, int s, int m, int e) {
        int i = s;
        int j = m;
        int k = s;
        int inv_count = 0;

        while(i < m && j < e) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                inv_count = inv_count + (m - i);
            }
        }

        while(i < m) {
            temp[k++] = arr[i++];
        }
        while(j < e) {
            temp[k++] = arr[j++];
        }

        for(i = s; i <= e; i++) {
            arr[i] = temp[i];
        }

        return inv_count;
    }
}
