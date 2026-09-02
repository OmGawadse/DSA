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

    public static int OptimalApproach(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    public static int divide(int[] nums, int low, int high) {

        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;

        int count = divide(nums, low, mid);

        count += divide(nums, mid + 1, high);

        count += merge(nums, low, mid, high);

        return count;
    }

    public static int merge(int[] nums, int low, int mid, int high) {

        int count = 0;

        int j = mid + 1;

        for (int i = low; i <= mid; i++) {

            while (j <= high && (long) nums[i] > 2L * nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

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

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }

        return count;
    }

//----------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 3, 1};

        int result = BetterApproach(nums);
        System.out.println("Number of Reverse Pairs using better Approach: " + result);

         int answer = OptimalApproach(nums);
        System.out.println("Number of Reverse Pairs: " + answer);
    }
}