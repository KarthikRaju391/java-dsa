package arrays;

import java.util.Collections;
import java.util.HashMap;

public class SortByFrequency {
    public static void main(String[] args) {

    }

    static int[] sort(int[] arr, int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[size];
        for(int i = 0; i < size; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return res;
    }
}
