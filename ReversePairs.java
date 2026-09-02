// 74 . Reverse Pairs

import java.util.ArrayList;

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
// -----------------------------------------------------------------OPTIMAL APPROACH-----------------------------------------------------
    // Time Complexity: O(n log n) & Space Complexity: O(n)
    public static int OptimalApproach(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    private static int divide(int[] nums, int l, int r) {

        // If l >= r, there is only one element in the range & a single element cannot form a reverse pair.
        if (l >= r) return 0;

        int mid = l + (r - l) / 2;
        int count = 0;

        // Divide and count reverse pairs in the left half. Recursion continues until the left half is divided into single elements.
        count += divide(nums, l, mid);

        // Divide and count reverse pairs in the right half. Recursion continues until the right half is divided into single elements.
        count += divide(nums, mid + 1, r);

        // mid + 1 is the first index of the right half, so j starts from the first element of the right half.
        int j = mid + 1;

        // i starts from the first index of the left half.
        for (int i = l; i <= mid; i++) {

            while (j <= r && (long) nums[i] > 2L * nums[j]) {

                j++;    // nums[i] and nums[j] form a reverse pair, so move j to check the next element of the right half.
            }

            // j - (mid + 1) gives the number of elements in the right half that form reverse pairs with nums[i].
            count += j - (mid + 1);
        }

        merge(nums, l, mid, r);

        return count;
    }

    // This function merges the sorted left and right halves
    // into one sorted range.
    public static void merge(int[] nums, int l, int mid, int r) {

        ArrayList<Integer> temp = new ArrayList<>();

        // i starts at l, the first index of the left half.
        int i = l;

        // j starts at mid + 1, the first index of the right half.
        int j = mid + 1;

        // Compare elements from both halves and add the smaller element to temp.
        while (i <= mid && j <= r) {

            if (nums[i] <= nums[j]) {
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }

        // If elements are still remaining in the left half, add all of them to temp.
        while (i <= mid) {
            temp.add(nums[i]);
            i++;
        }

        // If elements are still remaining in the right half, add all of them to temp.
        while (j <= r) {
            temp.add(nums[j]);
            j++;
        }

        // Copy the sorted elements from temp back into nums.
        for (int x = l; x <= r; x++) {
            nums[x] = temp.get(x - l);
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 3, 1};

        int result = BetterApproach(nums);
        System.out.println("Number of Reverse Pairs using better Approach: " + result);

         int answer = OptimalApproach(nums);
        System.out.println("Number of Reverse Pairs using Optimal Approach: " + answer);
    }
}