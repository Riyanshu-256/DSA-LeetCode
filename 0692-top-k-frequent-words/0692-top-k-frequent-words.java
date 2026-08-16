import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        //HashMap to store word and its frequency
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        //Max Heap
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (map.get(a).equals(map.get(b))) {
                    return a.compareTo(b);
                }

                return map.get(b) - map.get(a);
            }
        );

        //Add all words to PriorityQueue
        pq.addAll(map.keySet());

        //Store top k words
        List<String> ans = new ArrayList<>();

        while (k > 0) {
            ans.add(pq.poll());
            k--;
        }

        return ans;
    }
}