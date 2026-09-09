class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        // Start from node 0
        path.add(0);

        dfs(0, graph, path, result);

        return result;
    }

    private void dfs(int node, int[][] graph,
                     List<Integer> path,
                     List<List<Integer>> result) {

        // Reached target node
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
            return;
        }

        // Visit all neighbours
        for (int next : graph[node]) {

            path.add(next);

            dfs(next, graph, path, result);

            // Backtrack
            path.remove(path.size() - 1);
        }
    }
}