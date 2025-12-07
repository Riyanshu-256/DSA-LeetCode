package ARRAY;

public class P05_Two_Sum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(target == nums[i] + nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};  // if no pairs of array not found
    }
}
}
