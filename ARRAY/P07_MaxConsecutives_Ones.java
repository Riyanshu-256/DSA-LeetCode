package ARRAY;

public class P07_MaxConsecutives_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int res = 0, count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                count = 0;
            } else {
                count ++;
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
