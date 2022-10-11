package Capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CheckIfSubset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 4, 5};
//        Arrays.sort(arr);
//        Arrays.sort(arr1);
//        System.out.println(checkSubset(0, arr, arr1, new ArrayList<>()));
        System.out.println(checkSubsetBetter(arr, arr1, arr.length, arr1.length));
    }

    static boolean checkSubsetAlt(int[] arr, int[] arr1, int m, int n) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < m; i++) {
            set.add(arr[i]);
        }

        for(int i = 0; i < n; i++) {
            if(!set.contains(arr1[i])) {
                return false;
            }
        }
        return true;
    }

    static boolean checkSubsetBetter(int[] arr, int[] arr1, int m, int n) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < m; i++) {
            set.add(arr[i]);
        }
        int p = set.size();

        for(int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        if(p == set.size()) {
            return true;
        }
        return false;
    }
    static boolean checkSubset(int index, int[] arr, int[] arr1, ArrayList<Integer> list) {
        if(index == arr.length) {
            if(list.size() == arr1.length) {
                for(int i = 0; i < arr1.length; i++) {
                    if(arr1[i] != list.get(i)) return false;
                }
                return true;
            }
            return false;
        }

        list.add(arr[index]);
        if(checkSubset(index + 1, arr, arr1, list)) {
            return true;
        }
        list.remove(list.size() - 1);

        return checkSubset(index + 1, arr, arr1, list);
    }
}
