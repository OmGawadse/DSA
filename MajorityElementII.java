// 66. Majority Element II(N/3)

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> BruteForce(int[] nums) {

        List<Integer> ans = new ArrayList<>(); // This list will store the final majority elements.
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // If we've already added this number in List, don't count it again. This avoids Duplicate.
            if (ans.contains(nums[i])) {  
                continue;
            }

            int count = 0;

            // Count how many times nums[i] appears in the array.
            for (int j = 0; j < n; j++){
                if (nums[i] == nums[j]) count++; 
            }

            // If its frequency is greater than n/3, it is one of the required majority elements.
            if (count > n / 3) ans.add(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 3};

        List<Integer> result = BruteForce(nums);

        System.out.println("Majority Elements: " + result);
    }
}