class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // code here

        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;

        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 0){
                ans[j] = nums[i];
                j++;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] % 2 != 0){
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;
    }
}