package arrays;

import java.util.HashMap;
import java.util.Map;

public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 30, 50, 20, 10, 20};
        findRepeating(arr);
    }

    static void findRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Returns NON-REPEATING values
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("-----------------------------");
        // Returns REPEATING values
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
