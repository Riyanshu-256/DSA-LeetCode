import java.util.*;

class Solution {
    public String reorganizeString(String s) {
        // code here

        // Create a hashmap to store char and its freq
        HashMap<Character, Integer> map = new HashMap<>();

        // Count freq
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Max Heap
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Add all char to pq
        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        // Take 2 diff char at a time
        while(pq.size() >= 2){
            char first = pq.poll();
            char second = pq.poll();

            ans.append(first);
            ans.append(second);

            // Decrease freq
            map.put(first, map.get(first) -1);
            map.put(second, map.get(second) -1);

            // If freq is remaining add back
            if(map.get(first) > 0){
                pq.add(first);
            }

            if(map.get(second) > 0){
                pq.add(second);
            }
        }

        // Check if one char left
        if(!pq.isEmpty()){

            char last = pq.poll();

            if(map.get(last) > 1){
                return "";
            }
            
            ans.append(last);
        }
        return ans.toString();
    }
}