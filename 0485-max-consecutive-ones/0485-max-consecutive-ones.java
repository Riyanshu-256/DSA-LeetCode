class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // code here

        int n = nums.length;

        int length = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                length++;
            } else { 
                max = Math.max(max, length);
                length = 0;
            }
        }

        max = Math.max(max, length);

        return max;
    }
}