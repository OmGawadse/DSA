// LeetCode 560 : Subarray Sum Equals K

public class CountSubarray_SumEquals_Zero {
   
    // BRUTE FORCE APPROACH
    // Time Complexity  : O(n^3)     -    Space Complexity : O(1)

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

    // BETTER APPROACH
    // Time Complexity  : O(n^2)    -     Space Complexity : O(1)

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


    // ================================================================================================================
    // MAIN METHOD
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, -2, 5, 1};
        int k = 6;

        int bruteAnswer = BruteForceApproach(nums, k);
        int betterAnswer = BetterApproach(nums, k);

        System.out.println("Brute Force Answer : " + bruteAnswer);
        System.out.println("Better Approach Answer : " + betterAnswer);
    }
}