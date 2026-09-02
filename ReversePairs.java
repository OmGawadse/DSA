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

    // Time Complexity: O(n log n) & Space Complexity: O(n)
    public static int OptimalApproach(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    // divide() splits the array into two halves.
    // It recursively solves the left and right halves,
    // and then calls merge() to count reverse pairs
    // between the two halves.
    public static int divide(int[] nums, int low, int high) {

        // If there is only one element,
        // there cannot be any reverse pair.
        if (low >= high) {
            return 0;
        }

        // Find the middle index.
        int mid = low + (high - low) / 2;

        // Count reverse pairs in the left half.
        int count = divide(nums, low, mid);

        // Count reverse pairs in the right half.
        count += divide(nums, mid + 1, high);

        // Count reverse pairs between the left and right halves.
        count += merge(nums, low, mid, high);

        return count;
    }

     // merge() counts reverse pairs between the two sorted halves
    // and then merges them into one sorted array.
    public static int merge(int[] nums, int low, int mid, int high) {

        int count = 0;

        // j starts from the first element of the right half.
        int j = mid + 1;

        // Count reverse pairs.
        for (int i = low; i <= mid; i++) {

            // Check:
            // nums[i] > 2 * nums[j]
            //
            // 2L is used to avoid integer overflow.
            while (j <= high && (long) nums[i] > 2L * nums[j]) {
                j++;
            }

            // All elements from mid + 1 to j - 1
            // form reverse pairs with nums[i].
            count += j - (mid + 1);
        }
        // Temporary ArrayList used for merging.
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // Merge the two sorted halves.
        while (left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                right++;
            }
        }

        // Add remaining elements from the left half.
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        // Add remaining elements from the right half.
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // Copy sorted elements back into nums[].
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }

        return count;
    }


    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 3, 1};

        int result = BetterApproach(nums);
        System.out.println("Number of Reverse Pairs using better Approach: " + result);

         int answer = OptimalApproach(nums);
        System.out.println("Number of Reverse Pairs: " + answer);
    }
}