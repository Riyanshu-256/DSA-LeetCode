class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        // code here
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {

            int count = map.getOrDefault(num, 0);

            if (count < k) {
                list.add(num);
                map.put(num, count + 1);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}