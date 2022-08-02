package BinarySearch.theory;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] asc = {-5, -3, -1, 0, 3, 4, 7, 12, 32, 55, 89};
        int[] dsc = {90, 84, 23, 13, 4, 1, 0, -1, -5, -40};
        System.out.println(orderAgnosticSearch(dsc, 0));
    }

    static int orderAgnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return - 1;
    }
}
