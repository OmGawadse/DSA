// 67 . Three Sum
import java.util.*;


public class ThreeSum {

    public static List<List<Integer>> BruteForce(int[] nums) { // O(n^3) Time | O(n) Space

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


    // HashSet Approach : TC: O(n^2) | SC: O(n)
    public static List<List<Integer>> BetterApproach(int[] nums) {
 
        Set<List<Integer>> ans = new HashSet<>();

        // We need to choose the first two numbers. The third number will be searched using HashSet.
        for (int i = 0; i < nums.length; i++) {

            Set<Integer> set = new HashSet<>();  // This HashSet stores numbers we have already seen

            for (int j = i + 1; j < nums.length; j++) {

                // We need: 3th element
                // previously we did this  ---> nums[i] + nums[j] + third = 0  ........ Now by adjusting ----> third = -(nums[i] + nums[j])

                int third = -(nums[i] + nums[j]);

                if (set.contains(third)) { // for first occurence the third will not be present in the set, but for second occurence it will be present in the set. Hence we can find the triplet.

                    // We found a valid triplet.
                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    // Sorting makes the triplet consistent. ---> [-1, 0, 1] , [1, -1, 0]  ---  will take only one ---> [-1, 0, 1]
                    Collections.sort(temp);

                    // HashSet removes duplicate triplets.
                    ans.add(temp);
                }
                set.add(nums[j]); // Store the current number so that  future numbers can check against it.
            }
        }
        return new ArrayList<>(ans);
    }


    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = BruteForce(nums);
        System.out.println(result);

        List<List<Integer>> answer = BetterApproach(nums);
        System.out.println(answer);



    }
}