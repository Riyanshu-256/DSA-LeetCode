package ARRAY;

public class P04_SplitArraySum {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num); // max element
            right += num; // total sum
        }

        // Binary Search
        while (left < right) {
            int mid = (left + right) / 2;

            if (canSplit(nums, k, mid)) {
                right = mid; // try smaller largest sum
            } else {
                left = mid + 1; // need bigger largest sum
            }
        }
        return left;
    }

    private boolean canSplit(int[] nums, int k, int maxSumAllowed) {
        int count = 1, currSum = 0;
        for (int num : nums) {
            if (currSum + num > maxSumAllowed) {
                count++;
                currSum = num;
                if (count > k)
                    return false;
            } else {
                currSum += num;
            }
        }
        return true;
    }
}
