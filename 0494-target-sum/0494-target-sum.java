class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // target must be achievable
        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }

        int required = (sum + target) / 2;

        int[] dp = new int[required + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = required; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[required];
    }
}