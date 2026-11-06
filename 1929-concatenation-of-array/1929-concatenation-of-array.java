class Solution {
    public int[] getConcatenation(int[] nums) {
        // code here

        int n = nums.length;
        int[] ans = new int[2*n];
        int index = 0;

        for(int i=0; i<n; i++){
            ans[index++] = nums[i];
        }
        for(int i=0; i<n; i++){
            ans[index++] = nums[i];
        }

        return ans;
    }
}