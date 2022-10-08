package arrays;

public class MaxSubArrayProduct {
    public static void main(String[] args) {

    }

    static int findMaxProduct(int[] arr) {
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++) {
            int n = arr[i];
            int prevMaxProduct = maxProduct;

            maxProduct = Math.max(n, Math.max(minProduct * n, maxProduct * n));
            minProduct = Math.min(n, Math.min(minProduct * n, prevMaxProduct * n));

            ans = Math.max(maxProduct, ans);
        }
        return ans;
    }
}
