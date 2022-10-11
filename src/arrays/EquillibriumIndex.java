package arrays;

public class EquillibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1, 4};

        System.out.println(findIndex(arr));
    }

    static int findIndex(int[] arr) {
        int leftSum = 0;
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        for(int i = 0; i < arr.length; i++) {
            if(leftSum == sum - arr[i] - leftSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
