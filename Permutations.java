// LeetCode 46: Permutations
// Given an array nums of distinct integers, return all the possible permutations. 
// TC: O(n! * n) --->  n! for generating permutations and n for copying each permutation to the result list. 

import java.util.*;

public class Permutations {

    
    public static List<List<Integer>> permute(int[] nums) {

        
        List<List<Integer>> result = new ArrayList<>();

       
        solve(0, nums, result);

        return result;
    }


    public static void solve(int index, int[] nums, List<List<Integer>> result) {

        if (index == nums.length) {

            List<Integer> temp = new ArrayList<>();

            
            for (int num : nums) {
                temp.add(num);
            }

           
            result.add(temp);

            return; 
        }

        for (int i = index; i < nums.length; i++) {

            swap(nums, index, i);

            solve(index + 1, nums, result);

            swap(nums, index, i);
        }
    }


    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

           
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // Calling function but not using the simple regular integer array as output, 
            // instead we are using List of List of Integers to store the result of all permutations.

            List<List<Integer>> result = permute(nums);

            System.out.println("All permutations are:");
            for (List<Integer> list : result) {
                System.out.println(list);
            }
        }
    }
}
