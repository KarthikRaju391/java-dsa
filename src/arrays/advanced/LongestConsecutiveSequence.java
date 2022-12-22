package arrays.advanced;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }

    static int findLongestSequence(int[] arr, int n) {
        int longestStreak = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // input -> 2, 3, 1, 2, 3, 4, 5, 9, 10
        // in the set -> 2, 3, 1, 4, 5, 9, 10
        for (int num : arr) {
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum + 1)) {
                    currentNum+=1;
                    currentStreak+=1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
