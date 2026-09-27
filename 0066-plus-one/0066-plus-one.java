class Solution {
    public int[] plusOne(int[] digits) {
        // code here

        int n = digits.length;

        for(int i = n - 1; i >= 0; i--) {

            if(digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                // make 0
                digits[i] = 0;
            }
        }

        // Handle carry part - create a arr of n+1 length and at 0th index add carry 1
        int[] ans = new int[n + 1];
        ans[0] = 1;

        return ans;
    }
}