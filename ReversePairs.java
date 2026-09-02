// 74 . Reverse Pairs

public class ReversePairs {

    // Time Complexity: O(n^2) & Space Complexity: O(1)
    public static int BetterApproach(int[] nums) {

        int count = 0;
        int n = nums.length;

        // Check every possible pair (i, j)
        for (int i = 0; i < n; i++) {

            // j starts from i + 1 because i must be smaller than j
            for (int j = i + 1; j < n; j++) {

                // Check if nums[i] > 2 * nums[j]
                // long is used to avoid integer overflow
                if ((long) nums[i] > 2L * nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 3, 1};

        int result = BetterApproach(nums);
        System.out.println("Number of Reverse Pairs: " + result);
    }
}