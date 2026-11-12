class Solution {
    public int firstMatchingIndex(String s) {
        // code here

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                return left;
            }
            left++;
            right--;
        }
        return -1;
    }
}