class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {

        HashMap<String, Integer> map = new HashMap<>();

        int base = 0;
        int max = 0;

        for(int i = 0; i < nums.length - 1; i++){

            int a = nums[i];
            int b = nums[i + 1];

            // Already equal pair
            if(a == b){
                base++;
                continue;
            }

            int min = Math.min(a, b);
            int maxValue = Math.max(a, b);

            String key = min + "#" + maxValue;

            int count = map.getOrDefault(key, 0) + 1;

            map.put(key, count);

            max = Math.max(max, count);
        }

        return base + max;
    }
}