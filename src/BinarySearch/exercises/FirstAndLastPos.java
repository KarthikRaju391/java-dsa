package BinarySearch.exercises;

import java.util.Arrays;

public class FirstAndLastPos {
    public static void main(String[] args) {
      int[] nums = {5,7,7,8,8,8,10};
      int target = 8;
      System.out.println(Arrays.toString(getFirstAndLast(nums, target)));
    }

    static int[] getFirstAndLast(int[] arr, int target) {
        int[] ans = {-1, -1};
        int firstIndex = getPos(arr, target, true);
        int lastIndex = getPos(arr, target, false);
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;
    }

    static int getPos(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
