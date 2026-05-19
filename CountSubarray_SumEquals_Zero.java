
import java.util.HashMap;

// 64 . Count the number of subarrays that sum to a given value k.
// LeetCode 560 : Subarray Sum Equals K

public class CountSubarray_SumEquals_Zero {
   
    // BRUTE FORCE APPROACH : -----> Time Complexity  : O(n^3)     -    Space Complexity : O(1)

    public static int BruteForceApproach(int[] nums, int k) {

        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {

                int sum = 0;
                
                for(int x = i; x <= j; x++) {     // Calculate sum from index i to j
                    sum += nums[x];
                }

                // Check if subarray sum equals k
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    // BETTER APPROACH -------> Time Complexity  : O(n^2)    -     Space Complexity : O(1)

    public static int BetterApproach(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = i; j < n; j++) {

                sum += nums[j];

                // Check immediately after addition
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
    }


    // OPTIMAL APPROACH -------> Time Complexity  : O(n)    -     Space Complexity : O(n)

    public static int OptimalApproach(int[] nums, int k){

        int n = nums.length;
        int prefixsum = 0;
        int count = 0;

        // HashMap to store frequency of prefix sums
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: prefix sum of 0 occurs once.

        for(int i = 0; i < n; i++) {

            prefixsum += nums[i];

            // Check if there is a prefix sum that equals current prefix sum - k
            int check = prefixsum - k;
            if(map.containsKey(check)){  
                count += map.get(check); // Increment count by the frequency of the required prefix sum
            }

            // Update the frequency of the current prefix sum
            map.put(prefixsum, map.getOrDefault(prefixsum, 0) + 1);
        }
        return count;
    }

// ================================================================================================================

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, -2, 5, 1};
        int k = 6;

        int bruteAnswer = BruteForceApproach(nums, k);
        int betterAnswer = BetterApproach(nums, k);
        int optimalAnswer = OptimalApproach(nums, k);

        System.out.println("Brute Force Answer : " + bruteAnswer);
        System.out.println("Better Approach Answer : " + betterAnswer);
        System.out.println("Optimal Approach Answer : " + optimalAnswer);

        System.err.println("output = 3");
    }
}