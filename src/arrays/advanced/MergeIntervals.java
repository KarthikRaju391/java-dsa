package arrays.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3},{2, 6}, {8, 10}, {8,9},
                {9, 11}, {15, 18}, {2, 4}, {19, 21}
        };
        Arrays.sort(arr, Comparator.comparingInt(arr1 -> arr1[0]));

        System.out.println(Arrays.deepToString(merge(arr)));
    }

    static int[][] merge(int[][] intervals) {
        List<int[]> output = new ArrayList<>();

        int[] current_interval = intervals[0];
        output.add(current_interval);

        for(int[] interval : intervals) {
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if(current_end > next_begin) {
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = interval;
                output.add(current_interval);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}
