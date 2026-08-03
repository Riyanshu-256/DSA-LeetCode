class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;

        // Find the index of the largest element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Check if it is at least twice every other element
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}