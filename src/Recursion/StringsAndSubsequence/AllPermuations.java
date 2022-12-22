package Recursion.StringsAndSubsequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllPermuations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        boolean[] freq = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        findPermutationAlt(0, nums, ans);
        System.out.println(ans);
    }

    static void findPermutations(int[] nums, boolean[] freq, List<List<Integer>> ans, List<Integer> ds) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                findPermutations(nums, freq, ans, ds);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    static void findPermutationAlt(int index, int[] arr, List<List<Integer>> ans) {
        if(index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int j : arr) {
                ds.add(j);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }


        for(int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            findPermutationAlt(index + 1, arr, ans);
            swap(i, index, arr);
        }
    }

    static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
