class Solution {
    public int[] shuffle(int[] nums, int n) {
        // code here

        int[] ans = new int[2 * n];

        int k = 0;

        for (int i = 0; i < n; i++) {

            ans[k] = nums[i];
            k++;

            ans[k] = nums[i + n];
            k++;
        }

        return ans;
    }
}