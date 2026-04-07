import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // STEP 1: Find Breakpoint (idx)
        // Traverse from right and find first index where nums[i] < nums[i+1]
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;   // store index
                break;
            }
        }

        // If no breakpoint found
        // That means array is in descending order (last permutation)
        // So just reverse whole array to get smallest permutation
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // STEP 2: Find next greater element from right side
        // Find element just greater than nums[idx]
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {

                // Swap nums[idx] with nums[i]
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;

                break;
            }
        }

        // STEP 3: Reverse the right part (idx+1 to end)
        // This makes the sequence smallest after idx
        reverse(nums, idx + 1, n - 1);
    }

    // Helper function to reverse array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        System.out.println("Next Permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}