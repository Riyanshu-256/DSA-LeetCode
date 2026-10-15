class Solution {
    public int findMin(int[] nums) {
        // code here

        Arrays.sort(nums);
        int n = nums.length;

        return nums[0];
    }
}