import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            // Undirected graph
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Visited array
        boolean[] visited = new boolean[n];

        // BFS queue
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {

            int u = q.poll();

            // Destination reached
            if (u == destination) {
                return true;
            }

            // Visit neighbours
            for (int neighbour : adj.get(u)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return false;
    }
}