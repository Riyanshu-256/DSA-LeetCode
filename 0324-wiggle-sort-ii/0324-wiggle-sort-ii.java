class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        int[] arr = nums.clone();
        Arrays.sort(arr);

        int left = (n - 1) / 2;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                nums[i] = arr[left--];
            } else {
                nums[i] = arr[right--];
            }
        }
    }
}