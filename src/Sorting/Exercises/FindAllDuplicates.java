package Sorting.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List ans = find(nums);
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }

    static List<Integer> find(int[] arr) {

        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List <Integer> res = new ArrayList<>();
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] - 1 != j) {
                res.add(arr[j]);
            }
        }
        return res;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
