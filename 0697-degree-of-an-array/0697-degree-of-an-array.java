class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Degree
        int max = 0;

        for(int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        int ans = nums.length;

        // Find first and last occurrence
        for(int key : map.keySet()) {

            if(map.get(key) == max) {

                int first = -1;
                int last = -1;

                for(int i = 0; i < nums.length; i++) {

                    if(nums[i] == key) {

                        if(first == -1) {
                            first = i;
                        }

                        last = i;
                    }
                }

                int length = last - first + 1;

                ans = Math.min(ans, length);
            }
        }

        return ans;
    }
}