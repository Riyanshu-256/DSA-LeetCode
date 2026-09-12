class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // code here

        int n = nums.length;
        int left = -1;
        int right = -1;

        int max = nums[0];
        int min = nums[n - 1];

        for (int i = 0; i < n; i++) {

            if (nums[i] < max) {
                right = i;
            } else {
                max = nums[i];
            }

            if (nums[n - 1 - i] > min) {
                left = n - 1 - i;
            } else {
                min = nums[n - 1 - i];
            }
        }

        if (left == -1) {
            return 0;
        }

        return right - left + 1;
    }
}