class Solution {
    public int findDuplicate(int[] nums) {
        // code here

        int n = nums.length+1;

        boolean[] visited = new boolean[n];

        for(int num : nums){
            if(visited[num]){
                return num;
            } else {
            visited[num] = true;
            }
        }
        return -1;
    }
}