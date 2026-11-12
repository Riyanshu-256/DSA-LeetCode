class Solution {
    public int firstUniqueFreq(int[] nums) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count each element
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Count how many elements have each frequency
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int count : map.values()){
            freq.put(count, freq.getOrDefault(count, 0) + 1);
        }

        // Find first element with unique frequency
        for(int num : nums){
            if(freq.get(map.get(num)) == 1){
                return num;
            }
        }

        return -1;
    }
}