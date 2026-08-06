import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // code here

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1){

            int y = maxHeap.poll(); // first largest
            int x = maxHeap.poll();  // second largest 

            if(x != y){
                maxHeap.offer(y-x);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}