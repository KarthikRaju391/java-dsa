package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int N = 4;
        List<List<String>> queen = solve(N);
        int i = 1;
        for(List<String> it: queen) {
            System.out.println("Arrangement " + i);
            for(String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }

    static List<List<String>> solve(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        dfs(0, board, res);
        return res;
    }

    static boolean isSafe(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;

        // upper diagonal
        while(row >=0 && col >=0) {
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        // left row
        row = duprow;
        col = dupcol;
        while(col >= 0) {
            if(board[row][col] == 'Q') return false;
            col--;
        }

        // lower diagonal
        row = duprow;
        col = dupcol;
        while(col >=0 && row < board.length) {
            if(board[row][col] == 'Q') return false;
            col--;
            row++;
        }

        return true;
    }
    static void dfs(int col, char[][] board, List<List<String>> ans) {
        if(col == board.length) {
            List<String> ls = new LinkedList<>();
            for (char[] chars : board) {
                String s = new String(chars);
                ls.add(s);
            }
            ans.add(new ArrayList<>(ls));
            return;
        }

        for(int row = 0; row < board.length; row++) {
            // check if there is a safe place for queen
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                dfs(col+1, board, ans);
                board[row][col] = '.'; // replacing 'Q' with '.' while backtracking
            }
        }
    }

}
