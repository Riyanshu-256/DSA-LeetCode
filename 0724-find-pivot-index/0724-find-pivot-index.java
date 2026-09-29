class Solution {
    public int pivotIndex(int[] nums) {
        // code here

        int n = nums.length;
        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum
        for(int i=0; i<n; i++){
            totalSum += nums[i];
        }

        for(int i=0; i<n; i++){

            // Calculate right sum - after pi
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }

            // Calculate left sum - before pi
            leftSum += nums[i];
        }
        return -1;
    }
}