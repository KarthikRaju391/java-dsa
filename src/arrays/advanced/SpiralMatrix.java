package arrays.advanced;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(traverse(matrix));
    }

    static List<Integer> traverse(int[][] matrix) {
        int colBegin = 0;
        int rowBegin = 0;
        int colEnd = matrix[0].length - 1;
        int rowEnd = matrix.length - 1;

        List<Integer> res = new ArrayList<>();

        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            // traverse the first row --->
            for(int i = colBegin; i <= colEnd; i++) {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            // traverse the last column (downwards)
            for(int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            // traverse the last row <----
            if(colBegin <= colEnd) {
                for(int i = colEnd; i >= colBegin; i--) {
                   res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            // traverse the first col (upwards)
            if(rowBegin <= rowEnd) {
                for(int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }
        return res;
    }
}
