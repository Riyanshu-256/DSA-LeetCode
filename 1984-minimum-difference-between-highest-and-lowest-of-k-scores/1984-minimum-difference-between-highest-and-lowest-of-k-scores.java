class Solution {
    public int minimumDifference(int[] nums, int k) {
        // code here

        Arrays.sort(nums);

        int n = nums.length;
        int minPossDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {

            int diff = nums[i + k - 1] - nums[i];

            minPossDiff = Math.min(minPossDiff, diff);
        }

        return minPossDiff;
    }
}