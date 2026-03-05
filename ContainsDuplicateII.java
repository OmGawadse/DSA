// 51. LeetCode Problem: 219. Contains Duplicate II
// Brute Force Approach: O(n^2) Time Complexity, O(1) Space Complexity.
// Optimal Approach (HashMap): O(n) Time Complexity, O(n) Space Complexity.

import java.util.HashMap;

public class ContainsDuplicateII {

    // Brute Force Approach
    public static boolean containsNearbyDuplicateBrute(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] == nums[j] && (j - i) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimal Approach (HashMap)
    public static boolean containsNearbyDuplicateOptimal(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {

                int oldIndex = map.get(nums[i]);

                if(i - oldIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);          // Add & Update the index of the current number in the map.
        }
        return false;
    }



    // ✅ Main method (Program entry point)
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println("Brute Force Result: " + containsNearbyDuplicateBrute(nums, k));
        System.out.println("Optimal Result: " + containsNearbyDuplicateOptimal(nums, k));
    }
}

    

