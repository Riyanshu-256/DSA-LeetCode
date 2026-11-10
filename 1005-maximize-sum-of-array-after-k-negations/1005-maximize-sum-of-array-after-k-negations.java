class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        // code here

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while (k > 0) {

            int min = map.firstKey();
            int freq = map.get(min);

            map.remove(min);

            map.put(-min, map.getOrDefault(-min, 0) + 1);

            k--;

            if (freq > 1) {
                map.put(min, freq - 1);
            }
        }

        int sum = 0;

        for (int num : map.keySet()) {
            sum += num * map.get(num);
        }

        return sum;
    }
}