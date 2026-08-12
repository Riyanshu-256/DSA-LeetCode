class Solution {
    public boolean canJump(int[] nums) {
        // code here

        int n = nums.length;
        int maxIndex = 0;
        int i=0;

        while(i <= maxIndex){
            maxIndex = Math.max(maxIndex, i+nums[i]);

            if(maxIndex >= (n-1)){
                return true;
            }
            i++;
        }
        return false;
    }
}