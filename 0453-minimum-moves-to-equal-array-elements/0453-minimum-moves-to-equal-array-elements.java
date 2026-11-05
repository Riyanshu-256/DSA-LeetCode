class Solution {
    public int minMoves(int[] nums) {
        // code here

        int n = nums.length;

        int min = nums[0];
        long sum = 0;

        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }

        return (int)(sum - (long) min * nums.length);
    }
}