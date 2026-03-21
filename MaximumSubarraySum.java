// 53. leetcode number 53: Maximum Subarray
// Find the contiguous subarray which has the largest sum and return its sum.
/*
KADANE'S ALGORITHM: Optimal Approach - Logic Explanation:   
                        Philosophy	"Don't carry a negative balance."
                        The "Bankruptcy" Rule	If currsum < 0, drop it and start fresh at 0.
Imagine you are walking down a street picking up bags of money.
Positive numbers are cash. Negative numbers are debt.
----->"As I walk, I keep a running total of the cash in my hand. 
If I pick up a debt that's so big it puts me in the red (negative), 
I'm not going to keep carrying that debt into the next block. 
I'll just drop everything, declare bankruptcy, and start picking up cash again from the next house right from 0. 
Meanwhile, I keep a mental note of the most cash I ever had in my hands at any single point during the walk."
*/

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

    // BETTER APPROACH: O(n^2) - Using 2 nested loops
    public static int maxSubArrayBetter(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) { // Start point
            int sum = 0; 
            for (int j = i; j < n; j++) { // End point
                // Optimization: Just add the current element to the previous sum
                sum += nums[j]; 
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    // OPTIMAL APPROACH: O(n) - Kadane's Algorithm
    public static int maxSubArrayOptimal(int nums[]){
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currsum =  0;

        for (int i = 0; i < n; i++) {
            currsum += nums[i];
            maxSum = Math.max(maxSum, currsum);
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Running Brute Force
        int resultBrute = maxSubArrayBrute(nums);
        System.out.println("Brute Force Result (O(n^3)): " + resultBrute);

        // Running Better Approach
        int resultBetter = maxSubArrayBetter(nums);
        System.out.println("Better Approach Result (O(n^2)): " + resultBetter);

        // Running Optimal Approach (Kadane's Algorithm)
        int resultOptimal = maxSubArrayOptimal(nums);
        System.out.println("Optimal Approach Result (O(n)): " + resultOptimal);
    }
}
  

/*
Kadane's Algorithm Explanation:
1. Initialize two variables: 
                        maxSum- to store the maximum sum found so far 
                        currentSum- to store the sum of the current subarray.
2. Iterate through each element in the array:
        a. Add the current element to currentSum.
        b. Update maxSum if currentSum is greater than maxSum.
        c. If currentSum becomes negative, reset it to 0(because a negative sum would decrease the sum of any future subarray).
3. After iterating through the array, maxSum will contain the largest sum of a contiguous subarray.

*/

