package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        int[][] path = new int[maze.length][maze.length];
        for (int[] rows : path) {
            Arrays.fill(rows, -1);
        }
                //  D   L  R   U
        int[] di = {+1, 0, 0, -1};
        int[] dj = {0, -1, +1, 0};

        List<String> ans = new ArrayList<>();
        if(maze[0][0] == 1) solve(0, 0, "", maze, path, ans, di, dj);
        System.out.println(ans);
    }

    static void solve(int row, int col, String s, int[][] maze, int[][] path, List<String> list, int[] di, int[] dj) {
        int n = maze.length;
        if(row == col && row == n-1) {
           list.add(s);
           return;
        }

        String dir = "DLRU";

        for(int index = 0; index < 4; index++) {
            int nextR = row + di[index];
            int nextC = col + dj[index];

            if(nextR >= 0 && nextC >= 0 && nextR < n && nextC < n && path[nextR][nextC] != 1 && maze[nextR][nextC] == 1) {
                path[nextR][nextC] = 1;
                solve(nextR, nextC, s+dir.charAt(index), maze, path, list, di, dj);
                path[nextR][nextC] = -1;
            }
        }
//        // downward
//        if (row+1 < n && maze[row + 1][col] == 1 && path[row + 1][col] != 1) {
//            path[row][col] = 1;
//            solve(row + 1, col, s + 'D', maze, path, list);
//            path[row][col] = -1;
//        }
//        // leftward
//        if (col - 1 >= 0 && maze[row][col - 1] == 1 && path[row][col - 1 ] != 1) {
//            path[row][col] = 1;
//            solve(row, col - 1, s + 'L', maze, path, list);
//            path[row][col] = -1;
//        }
//        // rightward
//        if (col < n && maze[row][col + 1] == 1 && path[row][col + 1] != 1) {
//            path[row][col] = 1;
//            solve(row, col + 1, s + 'R', maze, path, list);
//            path[row][col] = -1;
//        }
//        // upward
//        if (row - 1 >= 0 && maze[row - 1][col] == 1 && path[row - 1][col] != 1) {
//            path[row][col] = 1;
//            solve(row - 1, col, s + 'U', maze, path, list);
//            path[row][col] = -1;
//        }
    }
}
