class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // code here

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
}