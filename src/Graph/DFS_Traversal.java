package Graph;

import java.util.ArrayList;

public class DFS_Traversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 1; i <= 8; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 7);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 7);

//        System.out.println(dfsOnGraph(7,adj));
        System.out.println(numberOfProvinces(7, adj));
    }

    static void addEdge(ArrayList<ArrayList<Integer>> list, int s, int d) {
        list.get(s).add(d);
        list.get(d).add(s);
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

    static int numberOfProvinces(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        boolean[] vis = new boolean[V + 1];
        for(int i = 1; i <= V; i++) {
            if(!vis[i]) {
                count++;
                dfs(i, vis, adj, res);
            }
        }
        return count;
    }
}
