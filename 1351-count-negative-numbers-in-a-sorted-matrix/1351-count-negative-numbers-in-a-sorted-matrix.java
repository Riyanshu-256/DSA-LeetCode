class Solution {
    public int countNegatives(int[][] grid) {
        // code here
        
        int count = 0;

        for (int[] row : grid) {
            for (int num : row) {
                if (num < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}