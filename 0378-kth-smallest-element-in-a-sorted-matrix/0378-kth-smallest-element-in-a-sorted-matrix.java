import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        //  code here
        
        int n = matrix.length;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.add(matrix[i][j]);
            }
        }

        Collections.sort(list);

        return list.get(k - 1);
    }
}