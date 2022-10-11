package arrays;

import java.util.HashSet;

public class CheckDisjoint {
    public static void main(String[] args) {
        int[] arr1 = {10, 51, 2, 4};
        int[] arr2 = {80, 71, 29, 3};

        System.out.println(check(arr1, arr2));
    }

    static boolean check(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1) {
            set.add(num);
        }

        for(int n : arr2) {
            if(set.contains(n)) {
                return false;
            }
        }
        return true;
    }
}
