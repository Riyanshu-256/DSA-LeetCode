class Solution {
    public int[] sortEvenOdd(int[] nums) {
        // code here

        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j= i+2; j<n; j+=2){

                // even indices
                if(i % 2 == 0 && nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                // even indices
                if(i % 2 != 0 && nums[i] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}