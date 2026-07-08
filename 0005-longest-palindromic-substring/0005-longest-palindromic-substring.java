class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {

            // Odd length palindrome
            int l = i - 1;
            int r = i + 1;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLength) {
                    maxLength = r - l + 1;
                    start = l;
                }
                l--;
                r++;
            }

            // Even length palindrome
            l = i;
            r = i + 1;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLength) {
                    maxLength = r - l + 1;
                    start = l;
                }
                l--;
                r++;
            }
        }

        return s.substring(start, start + maxLength);
    }
}