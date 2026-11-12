class Solution {
    public int firstUniqueEven(int[] nums) {
        // code here

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums){
            if(num % 2 == 0 && map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}