// 46 .  
// 485. Max Consecutive Ones
// Given a binary array nums, return the maximum number of consecutive 1's in the array

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1, 1, 1};

        int result = findMaxConsecutiveOnes(nums);

        System.out.println("Maximum consecutive ones: " + result);
    }
}
