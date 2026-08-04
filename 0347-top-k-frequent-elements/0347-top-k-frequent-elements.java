// import java.util.*;

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Store frequency of each integer
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         // Convert map entries into list
//         List<Map.Entry<Integer, Integer>> list =
//                 new ArrayList<>(map.entrySet());

//         // Sort by frequency in descending order
//         list.sort((a, b) -> b.getValue() - a.getValue());

//         // Store top k elements
//         int[] result = new int[k];

//         for (int i = 0; i < k; i++) {
//             result[i] = list.get(i).getKey();
//         }

//         return result;
//     }
// }



class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequnecy
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Sort by frequency using max heap
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        int[] ans = new int[k];

        for(int i=0; i<k; i++){
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }
}