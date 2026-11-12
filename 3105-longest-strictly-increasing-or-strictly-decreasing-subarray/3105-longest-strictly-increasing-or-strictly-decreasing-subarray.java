class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        // code here

        int n = nums.length;

        int countInc = 1;
        int countDec = 1;
        int ans = 1;

        for (int i = 1; i < n; i++) {

            if (nums[i] > nums[i - 1]) {
                countInc++;
                countDec = 1;
            } 
            else if (nums[i] < nums[i - 1]) {
                countDec++;
                countInc = 1;
            } 
            // if consecutive num are duplicate
            else {
                countInc = 1;
                countDec = 1;
            }

            ans = Math.max(ans, Math.max(countInc, countDec));
        }

        return ans;
    }
}