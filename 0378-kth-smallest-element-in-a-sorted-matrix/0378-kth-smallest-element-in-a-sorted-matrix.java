import java.util.Arrays;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;
        int[] temp = new int[n * n];

        int idx = 0;

        // Copy matrix into 1D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[idx++] = matrix[i][j];
            }
        }

        // Sort the array
        Arrays.sort(temp);

        return temp[k - 1];
    }
}