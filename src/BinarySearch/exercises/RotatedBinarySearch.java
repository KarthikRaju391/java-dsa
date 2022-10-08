package BinarySearch.exercises;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target =0;
        int pivot = findPivot(nums);
        if (pivot == -1) {
            // just do normal binary search
            System.out.println(binarySearch(nums, target, 0 , nums.length - 1));
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            System.out.println(pivot);
        }

        if (target >= nums[0]) {
            System.out.println(binarySearch(nums, target, 0, pivot - 1));
        } else {
            System.out.println(binarySearch(nums, target, pivot + 1, nums.length - 1));
        }
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid+1] < arr[mid]) {
               return mid;
            } else if(mid > start && arr[mid-1] > arr[mid]) {
               return mid-1;
            } else if(arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
