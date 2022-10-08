package arrays;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20, 10, 20, 50, 10};
        System.out.println(countElements(arr));
    }

    static int countElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}

