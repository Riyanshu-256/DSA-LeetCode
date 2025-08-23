package SORTING;

public class P02_MinimumElement {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        if (nums[low] <= nums[high]) {
            return nums[low];
        }

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] <= nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
