class Solution {
    public String customSortString(String order, String s) {
        // code here

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters in s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        // Add characters according to order
        for (char ch : order.toCharArray()) {

            if (map.containsKey(ch)) {

                int count = map.get(ch);

                while (count > 0) {
                    ans.append(ch);
                    count--;
                }

                map.remove(ch);
            }
        }

        // Add remaining characters
        for (char ch : map.keySet()) {

            int count = map.get(ch);

            while (count > 0) {
                ans.append(ch);
                count--;
            }
        }

        return ans.toString();
    }
}