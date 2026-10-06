class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // code here

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {

            for (int j = nums[i - 1] + 1; j < nums[i]; j++) {
                ans.add(j);
            }
        }

        return ans;
    }
}