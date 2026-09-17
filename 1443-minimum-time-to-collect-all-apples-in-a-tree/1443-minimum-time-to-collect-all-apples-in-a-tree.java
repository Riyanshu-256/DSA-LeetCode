class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Create graph
        for (int[] edge : edges) {
            int i = edge[0];
            int j = edge[1];

            adj.get(i).add(j);
            adj.get(j).add(i);
        }

        return dfs(0, -1, adj, hasApple);
    }

    public int dfs(int node, int parent,
                   List<List<Integer>> adj,
                   List<Boolean> hasApple) {

        int time = 0;

        // Traverse all neighbours
        for (int neighbour : adj.get(node)) {

            // Don't go back to parent
            if (neighbour == parent) {
                continue;
            }

            // Find time required for this subtree
            int childTime = dfs(neighbour, node, adj, hasApple);

            // If child subtree has an apple,
            // we need to go there and come back
            if (childTime > 0 || hasApple.get(neighbour)) {
                time += childTime + 2;
            }
        }

        return time;
    }
}