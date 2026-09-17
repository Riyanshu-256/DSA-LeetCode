class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // code here

        int[] dist = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        // k stops = k + 1 flights
        for (int i = 0; i <= k; i++) {

            int[] temp = dist.clone();

            for (int[] flight : flights) {

                int u = flight[0];
                int v = flight[1];
                int p = flight[2];

                if (dist[u] != Integer.MAX_VALUE &&
                    dist[u] + p < temp[v]) {

                    temp[v] = dist[u] + p;
                }
            }

            dist = temp;
        }

        return (dist[dst] == Integer.MAX_VALUE) ? -1 : dist[dst];
    }
}