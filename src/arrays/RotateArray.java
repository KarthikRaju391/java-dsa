package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
//        rotateLeftToRight(arr, 3);
        rotateRightToLeft(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateLeftToRight(int[] arr, int k) {
        // Rotate the array elements left-> right by one position for  K times
        // For K times, swap every positon of the array to the right
        // use the modulo operator so that the last element will be swapped to the first position

        for(int i = 0; i < k; i++) {
            int temp = arr[0];
            for(int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
    }

    static void rotateRightToLeft(int[] arr, int k) {
        for(int i = 0; i < k; i++) {
            int temp = arr[arr.length - 1];
            for(int j = arr.length - 1; j >= 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }
}
