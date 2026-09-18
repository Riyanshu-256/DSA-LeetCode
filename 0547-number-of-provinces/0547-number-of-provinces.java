class Solution {
    public int findCircleNum(int[][] isConnected) {
        // code here

        int n = isConnected.length;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                count++;

                Queue<Integer> q = new LinkedList<>();

                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {

                    int node = q.poll();

                    for (int neighbour : adj.get(node)) {

                        if (!visited[neighbour]) {
                            visited[neighbour] = true;
                            q.add(neighbour);
                        }
                    }
                }
            }
        }

        return count;
    }
}