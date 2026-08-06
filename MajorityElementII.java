// 66. Majority Element II(N/3)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    // 1. Brute Force Approach (O(n^2) Time | O(1) Space)
    public static List<Integer> BruteForce(int[] nums) {

        List<Integer> ans = new ArrayList<>(); // This list will store the final majority elements.
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Skip the element if it's already in the answer list.
            // This prevents adding duplicate majority elements.        
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


    // 2. Better Approach using Hashing (O(n) Time | O(n) Space)
    public static List<Integer> BetterApproach(int nums[]){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

       // Step 1: Count the frequency of every element
        for (int i = 0; i < n; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Step 2: Traverse the HashMap.
        // If an element appears more than n/3 times,
        // add it to the answer.
        for (int x : map.keySet()) {

            if (map.get(x) > n / 3) {
                ans.add(x);
            }
        }return ans;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 3};

        List<Integer> result = BruteForce(nums);

        System.out.println("Majority Elements: " + result);

        List<Integer> answer = BetterApproach(nums);
        System.out.println("Majority Elements: " + answer);
        }
}