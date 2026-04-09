// 58. Leetcode- 31 Next Permutation.
// Time Complexity: O(n).
// Space Complexity: O(1).
// Approach/ Logic:
// Step 1: Breakpoint :
// We will find the rightmost pair of indices (idx, idx+1) where nums[idx] < nums[idx+1]. 
// If no such index exists, we reverse the entire array to get the smallest permutation. 
// // Step 2: SWAP :
// If such an index is found, we will find the rightmost element that is greater than nums[idx] and swap them.
// Step 3: REVERSE : 
// Finally, we reverse the subarray to the right of idx to get the next permutation.

import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // STEP 1: Find Breakpoint (idx)
        // Traverse from right and find first index where nums[i] < nums[i+1]
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;   // store index
                break;
            }
        }

        // If no breakpoint found
        // That means array is in descending order (last permutation)
        // So just reverse whole array to get smallest permutation
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // STEP 2: Find next greater element from right side
        // Find element just greater than nums[idx]
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {

                // Swap nums[idx] with nums[i]
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;

                break;
            }
        }

        // STEP 3: Reverse the right part (idx+1 to end)
        // This makes the sequence smallest after idx
        reverse(nums, idx + 1, n - 1);
    }

    // Helper function to reverse array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        System.out.println("Next Permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}