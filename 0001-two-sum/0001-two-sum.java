// EFFICIENT APPROACH -> using HashMap
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//     }
// }


// BROUTE APPROACH 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // code here

        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int sum = nums[i] + nums[j];

                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
