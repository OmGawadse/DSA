// LeetCode 46: Permutations
// Given an array nums of distinct integers, return all the possible permutations. 
// TC: O(n! * n) --->  n! for generating permutations and n for copying each permutation to the result list. 

import java.util.*;

public class Permutations {

    // Main function to generate permutations
    public static List<List<Integer>> permute(int[] nums) {

        // We create a list called result to store all the permutations we will generate.
        List<List<Integer>> result = new ArrayList<>();

        // Start backtracking from index 0
        solve(0, nums, result);

        return result;
    }

    // Backtracking function
    public static void solve(int index, int[] nums, List<List<Integer>> result) {

        // BASE CASE:
        // When index reaches end → one permutation is ready
        if (index == nums.length) {

            // We must create a new list (copy)
            // Because nums keeps changing due to swaps
            List<Integer> temp = new ArrayList<>();

            // Copy current state of array into temp
            for (int num : nums) {
                temp.add(num);
            }

            // Store the copied permutation
            result.add(temp);

            return; // go back (backtracking starts here)
        }

        // TRY ALL POSSIBILITIES FOR CURRENT INDEX
        for (int i = index; i < nums.length; i++) {

            // STEP 1: FIX ELEMENT
            // Swap current index with i
            // This decides which number goes at 'index'
            swap(nums, index, i);

            // STEP 2: RECURSE
            // Move to next index
            solve(index + 1, nums, result);

            // STEP 3: BACKTRACK (UNDO)
            // Restore original array before next iteration
            swap(nums, index, i);
        }
    }

    // Helper function to swap elements
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    // This is our main function.
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            // Take input size
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            // Take array elements
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // Calling function but not using the simple regular integer array as output, 
            // instead we are using List of List of Integers to store the result of all permutations.

            List<List<Integer>> result = permute(nums);

            // Print all permutations
            System.out.println("All permutations are:");
            for (List<Integer> list : result) {
                System.out.println(list);
            }
        }
    }
}
