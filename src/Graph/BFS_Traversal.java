package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal {
    public static void main(String[] args) {

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
