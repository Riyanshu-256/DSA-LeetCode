import java.util.*;

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // code here
        
        List<Integer> list = new ArrayList<>();

        // Add 1
        for (int i = 0; i < numOnes; i++) {
            list.add(1);
        }

        // Add 0
        for (int i = 0; i < numZeros; i++) {
            list.add(0);
        }

        // Add -1
        for (int i = 0; i < numNegOnes; i++) {
            list.add(-1);
        }

        // Sort decreasing
        Collections.sort(list, Collections.reverseOrder());

        int maxSum = 0;

        // Take first k elements
        for (int i = 0; i < k; i++) {
            maxSum += list.get(i);
        }

        return maxSum;
    }
}