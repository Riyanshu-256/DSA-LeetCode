class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        // code here

        int totalSum = 0;

        for(int num : arr){
            totalSum += num;
        }

        if(totalSum % 3 != 0){
            return false;
        }

        int target = totalSum / 3;
        int sum = 0;
        int count = 0;

        for(int num : arr){
            sum += num;

            if(sum == target){
                count++;
                sum = 0;
            }
        }

        return count >= 3;
    }
}