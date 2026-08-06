class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // code here

        // Create a maxHeap that store the points 
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );

        for(int[] point : points){
            maxHeap.offer(point);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            ans[i] = maxHeap.poll();
        }
        
        return ans;
    }
}