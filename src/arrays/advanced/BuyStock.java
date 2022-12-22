package arrays.advanced;

public class BuyStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(bestTime(arr, arr.length));
    }

    static int bestTime(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < n; i++) {
            int cur_profit = arr[i] - min;
            if(arr[i] < min) {
                min = arr[i];
            } else if(cur_profit > profit) {
                profit = cur_profit;
            }
        }
        return profit;
    }
}
