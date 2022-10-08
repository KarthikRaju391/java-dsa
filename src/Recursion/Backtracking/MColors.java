package Recursion.Backtracking;

import java.util.List;

public class MColors {
    public static void main(String[] args) {

    }

    static boolean isSafe(int node, List<Integer>[] G, int[] color, int n, int col) {
        for(int it: G[node]) {
            if(color[it] == col) return false;
        }
        return true;
    }

    static boolean solve(int node, List<Integer>[] G, int[] color, int n, int m) {
        if(node == n) {
            return true;
        }

        for(int i = 1; i <= m; i++) {
            if(isSafe(node, G, color, n, i)) {
                color[node] = i;
                if(solve(node+1, G, color, n, m)) return true;
                color[node] = 0;
            }
        }
        return false;
    }
}
