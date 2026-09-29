class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // code here

        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new LinkedList<>();

        for(int num : nums){
            set.add(num);
        }

        int n = nums.length;

        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}