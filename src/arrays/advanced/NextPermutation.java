package arrays.advanced;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,3};
        findNextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void findNextPermutation(int[] arr) {
        // we find the break point, i.e., a[i] < a[i+1] from the end of the array

        int index1 = -1, index2 = -1;
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < arr[i + 1]) {
                index1 = i;
                break;
            }
        }

        // we find the least great element than the previously found element from the end of the array
        if(index1 != -1) {
            for(int i = arr.length - 1; i >= 0; i--) {
                if(arr[i] > arr[index1]) {
                    index2 = i;
                    break;
                }
            }
            // swap the two elements
            swap(arr, index1, index2);
        }
        // reverse the elements starting from the position after the break point
        reverse(arr, index1 + 1, arr.length - 1);
    }

    static void reverse(int[] arr, int i, int n) {
        while(i < n) {
            swap(arr, i, n);
            i++;
            n--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
