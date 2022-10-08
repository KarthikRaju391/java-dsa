package Recursion.StringsAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums); // only for subsetSumAlt
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//        getSubsetSum(0, nums, ans, 0);
        subsetSumAlt(0, nums, new ArrayList<>(), res);
//        System.out.println(ans);
        System.out.println(res);
    }

    static void getSubsetSum(int index, int[] arr, ArrayList<Integer> ans, int sum) {
        if(index == arr.length) {
            if(ans.size() == 0) {
                ans.add(sum);
            }else {
                for(int i = 0; i < ans.size(); i++) {
                    if(sum < ans.get(i)) {
                        ans.add(i, sum);
                        break;
                    }
                }
            }
            return;
        }

        // pick the element
        getSubsetSum(index+1, arr, ans, sum + arr[index]);

        // do not pick the element
        getSubsetSum(index+1, arr, ans, sum);
    }


    static void subsetSumAlt(int index, int[] arr, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans) {
        ans.add(new ArrayList<>(list));

        for(int i = index; i < arr.length; i++) {
            if(i != index && arr[i] == arr[i-1]) continue;

            list.add(arr[i]);
            subsetSumAlt(i+1, arr, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
