// 72 . Find the missing and repeating element in an array of size n containing numbers from 1 to n. 
// Brute Force Approach: O(n^2) time complexity and O(1) space complexity.

public class Find_Missing_and_Repeating_Element {

    // We need to return two values: missing and repeating. So, we return an int array containing both values.
    public static int[] BruteForceApproach(int[] nums) { 

        int n = nums.length;
        int missing = -1;
        int repeating = -1;

        // Check every number from 1 to N..........
        for(int i = 1; i <= n; i++) {

            int count = 0;

            // Count frequency of the number i in the array
            for(int j = 0; j < n; j++) {

                if(nums[j] == i) {
                    count++;
                }
            }
            if(count == 0) {            // If the number appears 0 times, 
                missing = i;            // it is the missing number
            }

            if(count > 1) {             // If the number appears more than once,
                repeating = i;          // it is the repeating number
            }
        }

        return new int[]{missing, repeating};       // Return Both Answers:- result[0] = missing number & result[1] = repeating number
    }


    public static int[] BetterApproach(int[] nums) {
        int n = nums.length;
        int missing = -1;
        int repeating = -1;

        // Create a frequency array. This store the frequency of each number.
        int[] freq = new int[n + 1]; 

        for(int i=0; i<n; i++) {
            freq[nums[i]]++;
        }

        for(int i = 1; i < n; i++){
            if(freq[i] == 0) missing = i;          // If the number appears 0 times, it is the missing number
            if(freq[i] > 1) repeating = i;         // If the number appears more than once, it is the repeating number
        }
        return new int[]{missing, repeating};
    }

    public static void main(String args[]) {

        int[] nums = {4, 3, 6, 2, 1, 1};

        int[] result = BruteForceApproach(nums);
        System.out.println("Missing: " + result[0]);        // result[0] contains the missing number
        System.out.println("Repeating: " + result[1]);      // result[1] contains the repeating number  

        int[] result2 = BetterApproach(nums);
        System.out.println("Missing: " + result2[0]);       
        System.out.println("Repeating: " + result2[1]);
    }
}
