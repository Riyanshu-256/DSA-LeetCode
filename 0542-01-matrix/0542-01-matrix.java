class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[][] dist = new int[rows][cols];
        Queue<int[]> queue = new ArrayDeque<>();

        // Mark all 1's as unvisited
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    dist[i][j] = -1;
                }
            }
        }

        int[][] directions = {
            {-1, 0}, // Up
            {1, 0},  // Down
            {0, -1}, // Left
            {0, 1}   // Right
        };

        while (!queue.isEmpty()) {

            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] dir : directions) {

                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows &&
                    newCol >= 0 && newCol < cols &&
                    dist[newRow][newCol] == -1) {

                    dist[newRow][newCol] = dist[row][col] + 1;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }

        return dist;
    }
}