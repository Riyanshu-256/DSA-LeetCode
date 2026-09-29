class Solution {
    public void sortColors(int[] nums) {
        // code here

        int n = nums.length;

        int zero = 0;
        int one = 0;
        int two = 0;

        // Count 0,1,2
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                zero++;
            } else if (nums[i] == 1){
                one++;
            } else {
                two++;
            }
        }

        int index = 0;

        // Put 0
        for(int i=0; i<zero; i++){
            nums[index++] = 0;
        }

        // Put 1
        for(int i=0; i<one; i++){
            nums[index++] = 1;
        }

        // Put 2
        for(int i=0; i<two; i++){
            nums[index++] = 2;
        }
    }
}