class Solution {
    public void moveZeroes(int[] nums) {
        // code here

        int n = nums.length;

        int index = 0;

        // If num != 0 then replace num with indexth value and increase it.
        for(int num : nums){
            if(num != 0){
                nums[index++] = num;
            }
        }

        // If index = n then skip otherwise add 0 at remaining index
        while(index < n){
            nums[index++] = 0;
        }
    }
}