// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         // code here

//         HashMap<Integer, Integer> map = new HashMap<>();

//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int num : nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for(int num : map.keySet()){
//             if(map.get(num) > 1){
//                 ans.add(num);
//             }
//         }
//         return ans;
//     }
// }


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // code here

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if (set.contains(nums[i])) {
                ans.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return ans;
    }
}