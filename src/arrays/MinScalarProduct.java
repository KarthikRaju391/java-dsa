package arrays;

import java.util.Arrays;
import java.util.Collections;

public class MinScalarProduct {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 6, 3, 7};
        Integer[] arr2 = {10, 7, 45, 3, 7};
        System.out.println(findMinScalarProduct(arr1, arr2));
        System.out.println(findMaxScalarProduct(arr1, arr2));
    }

    static int findMinScalarProduct(Integer[] arr1, Integer[] arr2) {
        int n = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        int product = 0;
        for(int i=0; i<n; i++)
            product += arr1[i]*arr2[i];

        return product;
    }

    static int findMaxScalarProduct(Integer[] arr1, Integer[] arr2) {
        int n = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int product = 0;
        for(int i = 0; i < n; i++) {
            product += arr1[i] * arr2[i];
        }

        return product;
    }
}
