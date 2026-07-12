// EFFICIENT APPROACH -> using HashMap
// class Solution {
//     public boolean containsDuplicate(int[] nums) {

// BROUTE APPROACH
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // code here

        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
