class Solution {
    public int numFriendRequests(int[] ages) {

        int[] count = new int[121];

        // Frequency of each age
        for (int age : ages) {
            count[age]++;
        }

        int ans = 0;

        for (int a = 1; a <= 120; a++) {

            for (int b = 1; b <= 120; b++) {

                // b cannot receive request from a
                if (b <= 0.5 * a + 7) {
                    continue;
                }

                if (b > a) {
                    continue;
                }

                if (b > 100 && a < 100) {
                    continue;
                }

                ans += count[a] * count[b];

                // Same-age people cannot send request to themselves
                if (a == b) {
                    ans -= count[a];
                }
            }
        }

        return ans;
    }
}