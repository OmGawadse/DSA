// 70 . 

import java.util.*;

public class MergeSortedArray {

    public static void BruteForceApproach(int[] nums1, int m, int[] nums2, int n) {

        // Copy nums2 into the empty positions of nums1
        for(int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    public static void BetterApproach(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements of both sorted arrays
        while(i < m && j < n) {

            if(nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }

            k++;
        }

        // If one arr is completed but the 2nd array elements are remaining or vice versa
        while(i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        // After adding all the elements in the extra array; lets add it back to one of our og array
        for(int x = 0; x < m + n; x++) {
            nums1[x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 0, 0, 0};
        int[] nums1Copy = {1, 2, 3, 4, 0, 0, 0};

        int m = 4;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        BruteForceApproach(nums1, m, nums2, n);
        System.out.println("Brute Force: " + Arrays.toString(nums1));

        BetterApproach(nums1Copy, m, nums2, n);
        System.out.println("Better Approach: " + Arrays.toString(nums1Copy));
    }
}