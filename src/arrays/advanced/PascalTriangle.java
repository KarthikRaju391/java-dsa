package arrays.advanced;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(getTriangle(5));
    }

    static List<List<Integer>> getTriangle(int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row, pre = null;

        for(int i = 0; i < n; i++) {
            row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            res.add(row);
        }
        return res;
    }
}
