// import java.util.Arrays;

// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         // code here

//         int n = nums.length;
//         Arrays.sort(nums);
//         return nums[n - k];
//     }
// }



import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}