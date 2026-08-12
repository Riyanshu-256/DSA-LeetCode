class Solution {
    public int maxProfit(int[] prices) {
        // code here

        int n = prices.length;
        int profit = 0;

        if (n == 0) return 0;

        for (int i = 1; i < n; i++) {

            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}