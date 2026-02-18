// 43.
// Leetcode 1 - Two Sum
// Time Complexity = O(n) (best possible)
// Space Complexity = O(n) (due to HashMap)
import java.util.*;

public class TwoSum {

    // 1) Brute Force Approach
    public static int[] bruteForce(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // 2) Better Approach (HashMap)
    public static int[] betterApproach(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];

            if(map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            }

            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

 // 3) Optimal Approach (Two Pointer - Only for Sorted Array)
    public static int[] optimalApproach(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                return new int[]{left, right};
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
   
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println("Brute Force: " + Arrays.toString(bruteForce(arr, target)));
        System.out.println("Better (HashMap): " + Arrays.toString(betterApproach(arr, target)));

        // For optimal approach, array must be sorted
        System.out.println("Optimal (Two Pointer - Sorted Array Only): " 
                + Arrays.toString(optimalApproach(arr, target)));
    }
}
