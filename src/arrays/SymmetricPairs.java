package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class SymmetricPairs {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20},
                {30, 40},
                {50, 60},
                {20, 10},
                {40, 30}
        };
        findSymmetricPair(arr);
    }

    static void findSymmetricPair(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println("(" + arr[i][0] + ", " + arr[i][1] + ")");
                }
            }
        }
    }

    static void findSymmetricPairHash(int[][] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            Integer val = map.get(second);

            if(val != null && val == first) {
                System.out.println("(" + first + ", " + second + ")");
            } else {
                map.put(first, second);
            }
        }
    }
}
