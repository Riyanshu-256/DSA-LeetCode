// EFFICIENT APPROACH -> using HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // code here

        // Create a hashset to store nums element
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            int need = target - nums[i];

            if(map.containsKey(need)){
                return new int[]{map.get(need) , i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}


// BROUTE APPROACH 
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // code here

//         int n = nums.length;
//         for(int i=0; i<n-1; i++){
//             for(int j=i+1; j<n; j++){
//                 int sum = nums[i] + nums[j];

//                 if(sum == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{-1,-1};
//     }
// }
