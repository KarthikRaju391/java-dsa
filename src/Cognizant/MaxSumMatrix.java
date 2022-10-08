package Cognizant;

import java.util.Scanner;

public class MaxSumMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row dimension of array: ");
        int row = in.nextInt();
        System.out.println("Enter column dimension of the array: ");
        int col = in.nextInt();
        System.out.println("Enter the matrix elements: ");
        int[][] matrix = new int[row][col];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println(findMax(matrix, col, row));
    }

    static int findMax(int[][] matrix, int M, int N) {
        int rowMax = 0;
        int colMax = 0;

        for(int i = 0; i < N; i++) {
            int sum = 0;
            for(int j = 0; j < M; j++) {
                sum += matrix[i][j];
            }
            if(sum > colMax) {
                colMax = sum;
            }
        }

        for(int i = 0; i < M; i++) {
            int sum = 0;
            for(int j = 0; j < N; j++) {
                sum += matrix[j][i];
            }
            if(sum > rowMax) {
                rowMax = sum;
            }
        }
        return rowMax + colMax;
    }
}
