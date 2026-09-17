class Solution {
    public int removeStones(int[][] stones) {
        // code here

        int n = stones.length;

        List<List<Integer>> adj = new ArrayList<>();

        // Create adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Create edges
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (stones[i][0] == stones[j][0] ||
                    stones[i][1] == stones[j][1]) {

                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[n];

        int components = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                components++;

                dfs(i, adj, visited);
            }
        }

        return n - components;
    }

    public void dfs(int node, List<List<Integer>> adj, boolean[] visited) {

        visited[node] = true;

        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited);
            }
        }
    }
}