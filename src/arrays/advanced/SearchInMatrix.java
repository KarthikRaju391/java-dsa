package arrays.advanced;

public class SearchInMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {10, 20, 30, 40},
//                {11, 21, 36, 43},
//                {25, 29, 39, 50},
//                {50, 60, 70, 80}
//        };
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
//        System.out.println(findAgain(matrix, 80));
//        System.out.println(find(matrix, 36));
        System.out.println(binarySearchBetter(matrix, 34));
    }

    static boolean find(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (binarySearch(row, target)) return true;
        }
        return false;
    }

    /*
        Works on matrices where each row is sorted in itself
        and each column is sorted in itself
     */
    static boolean findAgain(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            }
            if(target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    /*
        Works only when each row of the matrix is sorted and the last element of the row
        is smaller than the first element of the next row
     */
    static boolean binarySearchBetter(int[][] matrix, int target) {
        int start = 0;
        int end = (matrix.length * matrix[0].length) - 1;
        int rowLen = matrix[0].length;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            int element = matrix[mid/rowLen][mid%rowLen];

            if(target > element) {
                start = mid + 1;
            } else if(target < element) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
    static boolean binarySearch(int[] row, int target) {
        int start = 0;
        int end = row.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > row[mid]) {
                start = mid + 1;
            } else if(target < row[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
