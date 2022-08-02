package BinarySearch.theory;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-5, -3, -1, 0, 3, 4, 7, 12, 32, 55, 89};
        int target = -3;
        System.out.println(binarySearch(nums, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
