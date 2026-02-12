// 46 .  
// 485. Max Consecutive Ones
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Step 1: Initialize two variables, max and count, to keep track of the maximum number of consecutive 1's and the current count of consecutive 1's, respectively.
// Step 2: Iterate through the array nums using a for loop.
// Step 3: For each element in the array, check if it is equal to 1. If it is, increment the count variable and update the max variable if the current count is greater than the max.
// Step 4: If the element is not equal to 1, reset the count variable to 0.
// Step 5: After the loop, return the max variable, which contains the maximum number of consecutive 1's in the array.  

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



// Example:
// Input: nums = [1,1,0,1,1,1]  
// Output: 3