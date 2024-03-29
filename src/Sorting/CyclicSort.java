package Sorting;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] arr) {
       for(int i = 0; i < arr.length; i++) {
           while(arr[i] - 1 != i) {
              swap(arr, i, arr[i]-1);
           }
       }
    }

    static void sort2(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
