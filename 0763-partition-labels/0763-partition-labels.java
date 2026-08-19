class Solution {
    public List<Integer> partitionLabels(String s) {
        // code here

        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        // Store last index o feach character
        for (char c : s.toCharArray()) {
            map.put(c, s.lastIndexOf(c));
        }

        int start = 0;
        int end = 0;

        for(int i=0; i<s.length(); i++){

            // last index of current character
            end = Math.max(end, map.get(s.charAt(i)));

            // Partition complete
            if(i ==  end){
                ans.add(end - start + 1);
                start = i+1;
            }
        }
        return ans;
    }
}