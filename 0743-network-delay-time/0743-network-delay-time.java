class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int w = time[2];

            adj.get(u).add(new int[]{v, w});
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );

        dist[k] = 0;
        pq.offer(new int[]{k, 0});

        int maxTime = 0;
        int count = 0;

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int node = curr[0];
            int time = curr[1];

            if (time != dist[node]) {
                continue;
            }

            count++;
            maxTime = Math.max(maxTime, time);

            for (int[] edge : adj.get(node)) {

                int next = edge[0];
                int weight = edge[1];

                if (time + weight < dist[next]) {
                    dist[next] = time + weight;
                    pq.offer(new int[]{next, dist[next]});
                }
            }
        }

        return count == n ? maxTime : -1;
    }
}