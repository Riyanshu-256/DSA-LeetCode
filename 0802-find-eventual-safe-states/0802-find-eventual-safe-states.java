// class Solution {
//     public List<Integer> eventualSafeNodes(int[][] graph) {

//         int n = graph.length;

//         List<Integer> ans = new ArrayList<>();
//         int[] visited = new int[n];

//         for (int i = 0; i < n; i++) {
//             if (dfs(i, graph, visited)) {
//                 ans.add(i);
//             }
//         }

//         return ans;
//     }

//     public boolean dfs(int node, int[][] graph, int[] visited) {

//         if (visited[node] == 1) {
//             return false;
//         }

//         if (visited[node] == 2) {
//             return true;
//         }

//         visited[node] = 1;

//         for (int next : graph[node]) {

//             if (!dfs(next, graph, visited)) {
//                 return false;
//             }
//         }

//         visited[node] = 2;

//         return true;
//     }
// }




class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        // code here

        int n = graph.length;

        int[] degree = new int[n];

        List<List<Integer>> reverse = new ArrayList<>();

        // Find degree
        for (int i = 0; i < n; i++) {
            reverse.add(new ArrayList<>());
            degree[i] = graph[i].length;
        }

        // reverse the graph
        for (int i = 0; i < n; i++) {
            for (int next : graph[i]) {
                reverse.get(next).add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();

        // if degree of node = 0, add in queue
        for (int i = 0; i < n; i++) {
            if (degree[i] == 0) {
                q.add(i);
            }
        }

        // Create a safe array
        boolean[] safe = new boolean[n];

        // Poll -> mark safe -> go to prev-> degree-- -> if degree[prev] = 0 -> add in q
        // Repeat this process untill q becomes empty
        while (!q.isEmpty()) {

            int node = q.poll();

            safe[node] = true;

            for (int prev : reverse.get(node)) {

                degree[prev]--;

                if (degree[prev] == 0) {
                    q.add(prev);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        // Add those node in ans which are safe
        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}