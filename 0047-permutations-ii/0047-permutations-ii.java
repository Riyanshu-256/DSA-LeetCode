class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        solve(nums, used, curr, ans);

        return ans;
    }

    private void solve(int[] nums, boolean[] used,
                       List<Integer> curr,
                       List<List<Integer>> ans) {

        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            // duplicate skip
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            curr.add(nums[i]);
            used[i] = true;

            solve(nums, used, curr, ans);

            // backtrack
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}