// 70 . 

import java.util.*;

public class MergeSortedArray {
    // “In the previous problems, we were creating and returning a new result, so the method had to return a value. 
    // Here, nums1 is already provided as an input array with enough extra space, and the problem asks us to modify nums1 in-place. 
    // Since arrays are mutable and the changes made inside the method are reflected in the original array, 
    // there is no need to return the array. Therefore, I used void.”

    public static void BruteForceApproach(int[] nums1, int m, int[] nums2, int n) { // Time Complexity: O((m+n)log(m+n)) & Space Complexity: O(1)

        // Copy nums2 into the empty positions of nums1
        for(int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }


    public static void BetterApproach(int[] nums1, int m, int[] nums2, int n) { // Time Complexity: O(m+n) and Space Complexity: O(m+n)

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

    public static void OptimalApproach(int[] nums1, int m, int[] nums2, int n) {

    int i = m - 1;        // Points to the last actual element of nums1
    int j = n - 1;        // Points to the last element of nums2
    int k = m + n - 1;    // Points to the last position of nums1

    // Compare elements from the end and place the larger element at position k
    while (i >= 0 && j >= 0) {

        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } 
        else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }

    // If elements are still left in nums2, copy them into nums1
    while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
    }
}

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 0, 0, 0};
        int[] nums1Copy = {1, 2, 3, 4, 0, 0, 0};
        int[] nums1Copy2 = {1, 2, 3, 4, 0, 0, 0};

        int m = 4;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        BruteForceApproach(nums1, m, nums2, n);
        System.out.println("Brute Force: " + Arrays.toString(nums1));

        BetterApproach(nums1Copy, m, nums2, n);
        System.out.println("Better Approach: " + Arrays.toString(nums1Copy));

        OptimalApproach(nums1Copy2, m, nums2, n);
        System.out.println("Optimal Approach: " + Arrays.toString(nums1Copy2));
    }
}