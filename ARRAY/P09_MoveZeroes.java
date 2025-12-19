package ARRAY;

public class P09_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }

        }
    }
}
