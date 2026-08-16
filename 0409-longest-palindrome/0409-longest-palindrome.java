import java.util.*;

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean odd = false;

        // Check frequencies
        for (int freq : map.values()) {

            if (freq % 2 == 0) {
                // Complete even frequency can be used
                length += freq;
            } 
            else {
                // Use the even part
                length += freq - 1;

                // One odd character can be placed in center
                odd = true;
            }
        }

        // If any odd frequency exists, one character can be placed in the center
        if (odd) {
            length++;
        }

        return length;
    }
}