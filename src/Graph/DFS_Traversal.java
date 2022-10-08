package Graph;

import java.util.ArrayList;

public class DFS_Traversal {
    public static void main(String[] args) {

    }

    static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res) {
        res.add(node);
        vis[node] = true;
        for(Integer it: adj.get(node)) {
            if(!vis[it]) {
                dfs(it, vis, adj, res);
            }
        }
    }

    static ArrayList<Integer> dfsOnGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[V + 1];
        for(int i = 1; i <= V; i++) {
            if(!vis[i]) {
//                vis[i] = true;
                dfs(i, vis, adj, res);
            }
        }
        return res;
    }
}
