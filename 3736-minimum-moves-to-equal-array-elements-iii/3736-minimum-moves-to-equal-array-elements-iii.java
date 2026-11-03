class Solution {
    public int minMoves(int[] nums) {
        // code here
        
        Arrays.sort(nums);

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            count += nums[n - 1] - nums[i];
        }

        return count;
    }
}