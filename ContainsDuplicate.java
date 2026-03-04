// 50: LeetCode Problem: 217. Contains Duplicate.
// ✅ Brute Force Approach: O(n^2) Time Complexity, O(1) Space Complexity

public class ContainsDuplicate {

    // Brute Force Approach
    public static boolean containsDuplicateBrute(int[] nums) {
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        
        return false;
    }

    // ✅ Main Method (To Run in VS Code)
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 1};

        System.out.println("Brute Force Result-O(n^2) Time Complexity, O(1) Space Complexity: " + containsDuplicateBrute(arr));
       
    }
}