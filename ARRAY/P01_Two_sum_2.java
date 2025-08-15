package ARRAY;

public class P01_Two_sum_2 {
    
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int n = numbers.length;
        int low = 0, high = n - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1}; 
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return new int[]{}; 
    }
}
