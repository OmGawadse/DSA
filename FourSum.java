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



    public static List<List<Integer>> BetterApproach(int[] nums, int target) {
        int n = nums.length;

        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                Set<Long> set = new HashSet<>();                 // Stores numbers that we have already seen

                for (int k = j + 1; k < n; k++) {

                     //We need:-------- > nums[i] + nums[j] + nums[k] + fourth = target
                     //Therefore:----------> fourth = target - nums[i] - nums[j] - nums[k]

                    long fourth = (long) target - nums[i] - nums[j] - nums[k];

                    if (set.contains(fourth)) {

                        // (int) fourth because the answer needs Integer
                        ans.add(Arrays.asList( nums[i],nums[j],(int) fourth,nums[k]));
                    }

                    // Store current number for future searches
                    set.add((long) nums[k]);
                }
            }
        }
        // Convert Set<List<Integer>> into List<List<Integer>>
        return new ArrayList<>(ans);
    }



    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = BruteForceApproach(nums, target);
        System.out.println(result);

        List<List<Integer>> result2 = BetterApproach(nums, target);
        System.out.println(result2);


    }
}
