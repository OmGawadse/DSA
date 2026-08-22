// 70 .

import java.util.*;

public class MergeSortedArray {

    public static void BruteForceApproach(int[] nums1, int m, int[] nums2, int n) {

        // Copy nums2 into the empty positions of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 0, 0, 0};
        int m = 4;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        BruteForceApproach(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}