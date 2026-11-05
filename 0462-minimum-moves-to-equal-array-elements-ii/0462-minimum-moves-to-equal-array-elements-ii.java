class Solution {
    public int minMoves2(int[] nums) {
        // code here
        
        Arrays.sort(nums);

        int n = nums.length;
        int median = nums[n / 2];

        int moves = 0;

        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        return moves;
    }
}