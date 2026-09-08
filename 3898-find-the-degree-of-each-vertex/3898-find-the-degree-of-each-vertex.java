import java.util.*;

class Solution {
    public int[] findDegrees(int[][] matrix) {

        // Number of vertices
        int n = matrix.length;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Convert adjacency matrix to adjacency list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        // Create indegree array
        int[] indegree = new int[n];

        // Calculate indegree
        for (int i = 0; i < n; i++) {

            for (int neighbour : adj.get(i)) {
                indegree[neighbour]++;
            }
        }

        return indegree;
    }
}