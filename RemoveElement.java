// 56. LeetCode 27: Remove Element - Two Pointers Approach
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
// The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
// 1st pointer (i) iterates through the array, while the 2nd pointer (k) keeps track of the position to place valid elements.

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // pointer for placing valid elements

        for (int i = 0; i < nums.length; i++) {

            // If current element is NOT equal to val
            if (nums[i] != val) {

                // Place it at index k (in-place modification)
                nums[k] = nums[i];

                k++;
            }            
        }return k;

// If we want return the modified array instead of just k.
        /* 
        // Step 2: Fill remaining positions with val (or any marker)
        for (int i = k; i < nums.length; i++) {
            nums[i] = val;
        }

        return nums; // return full array
        */
    }

    public static void main(String[] args) {

        // Example input
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        // Call function
        int k = removeElement(nums, val);

        // Print result
        System.out.println("Number of elements (k): " + k);

        // Print modified array (only first k elements matter)
        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
// Time Complexity: O(n) - We traverse the array once.
// Space Complexity: O(1) - We use only a constant amount of extra space.