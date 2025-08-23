package SORTING;

import java.util.Arrays;

public class P05_MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // Copy nums2 into nums1 starting from index m
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Sort the final nums1
        Arrays.sort(nums1);
    }
}
