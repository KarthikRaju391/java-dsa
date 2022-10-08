package Recursion.StringsAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        int[] arr = {1, 1, 1, 2, 2};
        Arrays.sort(arr);
        getCombinationsAlt(0, arr, 4, outer, new ArrayList<>());
        System.out.println(outer);
    }

    static void getCombinations(int i, int[] arr, int target, ArrayList<ArrayList<Integer>> outer, ArrayList<Integer> list) {

        if(i == arr.length) {
            if(target == 0) {
                outer.add(new ArrayList<>(list));
            }
            return;
        }

        // pick the current index
        if(arr[i] <= target) {
            list.add(arr[i]);
            getCombinations(i, arr, target - arr[i],outer, list);
            list.remove(list.size() - 1);
        }

        getCombinations(i+1, arr, target, outer, list);
    }


    static void getCombinationsAlt(int index, int[] arr, int target, ArrayList<ArrayList<Integer>> outer, ArrayList<Integer> list) {
        if(target == 0) {
            outer.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < arr.length; i++) {
            if(i > index && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            list.add(arr[i]);
            getCombinationsAlt(i+1, arr, target - arr[i], outer, list);
            list.remove(list.size() - 1);
        }
    }
}
