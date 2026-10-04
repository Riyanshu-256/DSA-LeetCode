// class Solution {
//     public int findDuplicate(int[] nums) {
//         // code here

//         int n = nums.length+1;

//         boolean[] visited = new boolean[n];

//         for(int num : nums){
//             if(visited[num]){
//                 return num;
//             } else {
//             visited[num] = true;
//             }
//         }
//         return -1;
//     }
// }


class Solution {
    public int findDuplicate(int[] nums) {
        // code here

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}