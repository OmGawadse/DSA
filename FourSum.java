// 68. Four Sum

import java.util.*;

public class FourSum {

    public static List<List<Integer>> BruteForceApproach(int[] nums, int target) {

        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>(); // HashSet removes duplicate quadruplets

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {

                        // Use long to avoid integer overflow
                        long sum = nums[i] + nums[j] + nums[k] + nums[l];

                        if (sum == target) {

                            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            
                            ans.add(temp);

                            // We can also directly add the quadruplet to the HashSet without creating a temporary list:
                            // ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }
        // Convert Set into List
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = BruteForceApproach(nums, target);

        System.out.println(result);
    }
}
