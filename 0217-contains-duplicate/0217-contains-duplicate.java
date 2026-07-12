// EFFICIENT APPROACH -> using HashMap
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // code here

        // Create a hashmap that store element and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) >= 2){
                return true;
            }
        }
        return false;
    }
}

// --------------------------------------------------------------------------------- //

// // BROUTE APPROACH
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         // code here

//         Arrays.sort(nums);
//         int n = nums.length;

//         for(int i=0; i<n-1; i++){
//             if(nums[i] == nums[i+1]){
//                 return true;
//             }
//         }
//         return false;
//     }
// }