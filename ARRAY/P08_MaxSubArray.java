package ARRAY;

public class P08_MaxSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<n; i++){
            maxSum =Math.max(nums[i] + maxSum, nums[i]);
            res = Math.max(res, maxSum);
        }
        return res;
    }
}
