package Hashmap;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(findFrequency(nums, 2)));
    }

    static int[] findFrequency(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                int val = map.get(j);
                val++;
                map.put(j, val);
            }
        }
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//
//        for(int i = 0; i < s.length(); i++) {
//            if(map1.containsKey(s.charAt(i))) {
//                int val = map1.get(s.charAt(i));
//                val++;
//                map1.put(s.charAt(i), val);
//            }
//            if(map2.containsKey(t.charAt(i))) {
//                int val = map2.get(t.charAt(i));
//                val++;
//                map2.put(t.charAt(i), val);
//            } else {
//                map1.put(s.charAt(i), 1);
//                map2.put(t.charAt(i), 1);
//            }
//        }
//
//        for()

        return new int[]{0, 0};
    }
}
