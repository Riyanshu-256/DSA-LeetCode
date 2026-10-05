class Solution {
    public int maximumGap(int[] nums) {
        // code here

        Arrays.sort(nums);
        int n = nums.length;

        int maxDiff = 0;
        for(int i=1; i<n; i++){
            int diff = nums[i] - nums[i-1];

            maxDiff = Math.max(diff, maxDiff);
        }
        return maxDiff;
    }
}