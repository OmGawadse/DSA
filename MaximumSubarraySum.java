// 53. leetcode number 1

public class MaximumSubarraySum{

    // BRUTE FORCE: O(n^3) - Using 3 nested loops
    public static int maxSubArrayBrute(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) { // Start point
            for (int j = i; j < n; j++) { // End point
                int sum = 0;
                // The "Expensive" 3rd loop to calculate sum from i to j
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        
        
        // Running Brute Force
        int resultBrute = maxSubArrayBrute(nums);
        System.out.println("Brute Force Result (O(n^3)): " + resultBrute);

        
        
      
    }
}
  