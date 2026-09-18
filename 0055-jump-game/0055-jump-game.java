class Solution {
    public boolean canJump(int[] nums) {

        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[nums.length];

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            int index = q.poll();

            int jump = nums[index];

            if (index + jump >= nums.length - 1) {
                return true;
            }

            for (int j = index + 1; j <= index + jump && j < nums.length; j++) {

                if (!visited[j]) {
                    q.add(j);
                    visited[j] = true;
                }
            }
        }

        return false;
    }
}