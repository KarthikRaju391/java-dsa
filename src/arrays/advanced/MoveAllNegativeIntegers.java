package arrays.advanced;

import java.util.Arrays;

public class MoveAllNegativeIntegers {
    public static void main(String[] args) {
       int[] arr = {-1, 0, 4, -2, -3, 2, 8};
       move(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void move(int[] arr) {
        int j = 0;
        int i;
        for(i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                swap(arr, i, j++);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
