
public class ContainsDuplicateII {

    // Brute Force Approach
    public static boolean containsNearbyDuplicateBrute(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] == nums[j] && (j - i) <= k) {
                    return true;
                }
            }
        }

        return false;
    }


    // ✅ Main method (Program entry point)
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println("Brute Force Result: " + containsNearbyDuplicateBrute(nums, k));
       
    }
}
    

