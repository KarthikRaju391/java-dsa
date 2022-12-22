package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class NumberOfIslands {

    public static void main(String[] args) {
        int[][] grid = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}

//                {0,0,1,1,0,0},
//                {0,0,1,1,0,0},
//                {0,0,0,1,0,0},
//                {0,0,0,0,0,0},
//                {1,0,0,0,0,0},
//                {1,1,0,0,0,1},
        };
        System.out.println(numOfIslands(grid));
    }
    static void bfs(int ro, int co, int[][] vis, int[][] grid) {
        vis[ro][co] = 1;
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(ro, co));
        int n = grid.length;
        int m = grid[0].length;
        while(!queue.isEmpty()) {
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.poll();
            for(int delRow = -1; delRow <= 1; delRow++) {
                for(int delCol = -1; delCol <= 1; delCol++) {
                    int nrow = row + delRow;
                    int ncol = col + delCol;
                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                        vis[nrow][ncol] = 1;
                        queue.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }


    static int numOfIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                if(vis[row][col] == 0 && grid[row][col] == 1) {
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return count;
    }
}