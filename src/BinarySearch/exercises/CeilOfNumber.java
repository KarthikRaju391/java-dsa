package BinarySearch.exercises;

public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 12, 15, 17, 23};
        int target = 16;
        int res = floorOfNum(arr, target);
        System.out.println(res);
    }

    static int ceilOfNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            // calculating the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }

    static int floorOfNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            // calculating the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }

}
