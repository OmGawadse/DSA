// 67 . Three Sum
import java.util.*;


public class ThreeSum {

    public static List<List<Integer>> BruteForce(int[] nums) {

        int n = nums.length;

        Set<List<Integer>> ans = new HashSet<>(); // ans- Set containing Lists of Integers. Also SET To avoid Duplicates.

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        // Sort so duplicate triplets become identical  // [-1, 1, 0] & [0, -1, 1] are same triplets, 
                                                                        // but Java sees them as different lists. Hence we sue Collections.sort
                        Collections.sort(temp);

                        // HashSet removes duplicate triplets
                        ans.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = BruteForce(nums);

        System.out.println(result);
    }
}