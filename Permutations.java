// 57. Permutations LeetCode 46: Permutations - Backtracking Approach

import java.util.*;

public class Permutations {

    // Main function to generate permutations
    public static List<List<Integer>> permute(int[] nums) {

        // Result list to store all permutations
        List<List<Integer>> result = new ArrayList<>();

        // Start backtracking from index 0
        solve(0, nums, result); 

        return result;
    }

    // Backtracking function
    public static void solve(int index, int[] nums, List<List<Integer>> result) {

        // 🧠 BASE CASE:
        // When index reaches end → one permutation is ready
        if (index == nums.length) {

            // ⚠️ IMPORTANT:
            // We MUST create a new list (copy)
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


        // If index is not at the end, we need to try all possibilities for this index:
        // -----> TRY ALL POSSIBILITIES FOR CURRENT INDEX
        for (int i = index; i < nums.length; i++) {

            // 🔹 STEP 1: FIX ELEMENT
            // Swap current index with i
            // This decides which number goes at 'index'
            swap(nums, index, i);

            // 🔹 STEP 2: RECURSE
            // Move to next index
            solve(index + 1, nums, result);

            // 🔹 STEP 3: BACKTRACK (UNDO)
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 📥 Take input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // 📥 Take array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Generate permutations
        List<List<Integer>> result = permute(nums);

        // 📤 Print all permutations
        System.out.println("All permutations are:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }

        sc.close();
    }
}