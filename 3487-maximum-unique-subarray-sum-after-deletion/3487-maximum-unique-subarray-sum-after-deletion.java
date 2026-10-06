class Solution {
    public int maxSum(int[] nums) {
        // code here

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : set) {

            if (num > 0) {
                sum += num;
            }

            max = Math.max(max, num);
        }

        if (sum == 0) {
            return max;
        }

        return sum;
    }
}