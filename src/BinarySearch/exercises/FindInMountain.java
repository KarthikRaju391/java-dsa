package BinarySearch.exercises;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2};
        int peak = peakVal(arr);
        int res;
        res = binarySearch(arr, 2, 0, peak, false);
        if(res == -1) {
            res = binarySearch(arr, 2, peak + 1, arr.length-1, true);
        }
        System.out.println(res);
    }

    static int peakVal(int[]arr) {
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

    static int binarySearch(int[] arr, int target, int start, int end, boolean des) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                if(des) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else if(target > arr[mid]) {
                if(des) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                return mid;
            }
        }
        return -1;
    }

}
