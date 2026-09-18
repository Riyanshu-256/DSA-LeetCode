class Solution {
    public int jump(int[] nums) {
        // code here

        Queue<Integer> q = new LinkedList<>();

        int[] jumps = new int[nums.length];

        Arrays.fill(jumps, Integer.MAX_VALUE);

        q.add(0);
        jumps[0] = 0;

        while (!q.isEmpty()) {

            int index = q.poll();

            int jump = nums[index];

            for (int j = index + 1; j <= index + jump && j < nums.length; j++) {

                if (jumps[j] > jumps[index] + 1) {

                    jumps[j] = jumps[index] + 1;

                    q.add(j);
                }
            }
        }

        return jumps[nums.length - 1];
    }
}