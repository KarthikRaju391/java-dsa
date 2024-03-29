package Sorting.Exercises;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        int[] ans = find(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] find(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1) {
                return new int[] {arr[j],j+1};
            }
        }
        return new int[] {-1, -1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
