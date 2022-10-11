package Capgemini;

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceRank {
    public static void main(String[] args) {
        int[] arr = {100, 2, 70, 12 , 90};
        replace(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void replace(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < temp.length; i++) {
            map.put(temp[i], i + 1);
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
    }
}
