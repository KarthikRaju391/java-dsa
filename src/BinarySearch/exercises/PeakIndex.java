package BinarySearch.exercises;

public class PeakIndex {
    public static void main(String[] args) {
        int[] nums = {3, 5, 3, 2, 0};
        System.out.println(binarySearch(nums));
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid+1] < arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
