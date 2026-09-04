class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        // Maximum possible digits are 10 (0-9)
        n = Math.min(n, 10);

        int ans = 10;  // For 1-digit numbers
        int unique = 9;
        int available = 9;

        for (int digits = 2; digits <= n; digits++) {
            unique *= available;
            ans += unique;
            available--;
        }

        return ans;
    }
}