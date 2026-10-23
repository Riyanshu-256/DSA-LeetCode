class Solution {
    public int[] findErrorNums(int[] nums) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];

        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= nums.length; i++) {
            set.add(i);
        }
        
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                ans[0] = num;
                break;
            }
        }

        for (int num : set) {
            if (!map.containsKey(num)) {
                ans[1] = num;
                break;
            }
        }

        return ans;
    }
}