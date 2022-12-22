package arrays;

import java.util.Arrays;

public class CountInversions {
    public static void main(String[] args) {
        long[] nums = {5, 3, 2, 4, 1};
        int n = nums.length;
        long[] temp = new long[n];
        int res = sort(nums, temp, 0,  n - 1);
        System.out.println(res);
    }


    static int sort(long[] arr, long[] temp, int s, int e) {
        int mid, count = 0;
        if(e > s) {
            mid = (s + e) / 2;

            count += sort(arr, temp, s, mid);
            count += sort(arr, temp, mid+1, e);

            count += merge(arr, temp, s, mid + 1, e);
        }
        return count;
    }

    static int merge(long[] arr, long[] temp, int s, int m, int e) {
        int i = s;
        int j = m;
        int k = s;
        int inv_count = 0;

        while(i < m && j <= e) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                if(arr[i] > arr[j]) {
                    inv_count += m - i;
                    temp[k++] = arr[j++];
                }
            }
        }

        while(i < m) {
            temp[k++] = arr[i++];
        }
        while(j <= e) {
            temp[k++] = arr[j++];
        }

        for(i = s; i <= e; i++) {
            arr[i] = temp[i];
        }

        return inv_count;
    }
}
