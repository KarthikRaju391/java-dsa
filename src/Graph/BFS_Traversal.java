package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal {
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

        System.out.println(bfsOfGraph(7,adj));
    }

    static void addEdge(ArrayList<ArrayList<Integer>> list, int s, int d) {
        list.get(s).add(d);
        list.get(d).add(s);
    }
    static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V + 1];

        for(int i = 1; i <= V; i++) {
            if(!visited[i]) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                visited[i] = true;

                while(!q.isEmpty()) {
                    Integer node = q.poll();
                    res.add(node);

                    for(Integer it: adj.get(node)) {
                        if(!visited[it]) {
                            q.add(it);
                            visited[it] = true;
                        }
                    }
                }
            }
        }
        return res;
    }
}
