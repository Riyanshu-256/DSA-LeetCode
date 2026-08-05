import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // code here

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int weight : stones) {
            maxHeap.offer(weight);
        }

        while (maxHeap.size() > 1) {

            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if (y != x) {
                maxHeap.offer(y - x);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}