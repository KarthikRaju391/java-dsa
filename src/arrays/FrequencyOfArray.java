package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 5, 7, 8, 10};
//        Arrays.sort(arr);
        countFreq(arr, arr.length);
//        countFrequency(arr, arr.length);
    }

    static void countFreq(int[] arr, int size) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < size; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times ");
        }
    }
    static void countFrequency(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            int count = 1;
            while(i < size - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + " : " + count);
        }
    }
}
