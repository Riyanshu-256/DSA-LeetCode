class Solution {
    public long maximumImportance(int n, int[][] roads) {
        // code here
        
        // Find degree
        int[] degree = new int[n];

        for (int[] edges : roads) {
            degree[edges[0]]++;
            degree[edges[1]]++;
        }

        Arrays.sort(degree);

        long res = 0;
        int assignVal = 1;

        for (int i = 0; i < n; i++) {
            res += (long) degree[i] * assignVal;
            assignVal++;
        }

        return res;
    }
}