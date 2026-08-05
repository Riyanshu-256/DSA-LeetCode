import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // Max Heap based on distance from origin
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );

        // Add all points
        for (int[] point : points) {
            maxHeap.offer(point);

            // Keep only k closest points
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Store answer
        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            ans[i] = maxHeap.poll();
        }

        return ans;
    }
}