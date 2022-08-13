package Sorting.Exercises;

import java.util.ArrayList;
import java.util.List;

public class FindDissapearedNums {
    public static void main(String[] args) {
       int[] nums = {3,2,3,4,1,2,7,8};
       List ans = find(nums);
       System.out.println(ans);
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

        List<Integer> res = new ArrayList<>();
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1) {
               res.add(j + 1);
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
