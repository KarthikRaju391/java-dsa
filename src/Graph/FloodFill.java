package Graph;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 0, 1},
            {2, 1, 1, 0},
            {2, 2, 3, 1},
            {2, 2, 3, 4}
        };
        int[][] vis = grid;

        int[] delrow = {-1, 0, 0, +1};
        int[] delcol = {0, -1, +1, 0};

        dfs(3, 0, grid, vis, delrow, delcol, 2, 5);
        System.out.println(Arrays.deepToString(vis));
    }

    static void dfs(int row, int col, int[][] grid, int[][] vis, int[] delrow, int[] delcol, int iniColor, int newColor) {
         vis[row][col] = newColor;
         int n = grid.length;
         int m = grid[0].length;
         for(int i = 0; i < 4; i++) {
             int nrow = delrow[i] + row;
             int ncol = delcol[i] + col;
             if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == iniColor && vis[nrow][ncol] != newColor) {
                 dfs(nrow, ncol, grid, vis, delrow, delcol, iniColor, newColor);
             }
         }
    }
}
