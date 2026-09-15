class Solution {

    int rows;
    int cols;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        rows = image.length;
        cols = image[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int originalColor = image[sr][sc];

        // if clr is same then dont change
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, color, originalColor, visited);

        return image;
    }

    public void dfs(int[][] image, int row, int col, int color,
                    int originalColor, boolean[][] visited) {

        // Boundary check
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return;
        }

        // Already visited
        if (visited[row][col]) {
            return;
        }

        // Different color
        if (image[row][col] != originalColor) {
            return;
        }

        visited[row][col] = true;

        // Change color
        image[row][col] = color;

        // Up
        dfs(image, row - 1, col, color, originalColor, visited);

        // Down
        dfs(image, row + 1, col, color, originalColor, visited);

        // Left
        dfs(image, row, col - 1, color, originalColor, visited);

        // Right
        dfs(image, row, col + 1, color, originalColor, visited);
    }
}