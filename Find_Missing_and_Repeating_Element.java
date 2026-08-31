// 72 . Find the missing and repeating element in an array of size n containing numbers from 1 to n. 
// Brute Force Approach: O(n^2) time complexity and O(1) space complexity.
// Better Approach: O(n) time complexity and O(n) space complexity.

public class Find_Missing_and_Repeating_Element {

    // We need to return two values: missing and repeating. So, we return an int array containing both values.
    public static int[] BruteForceApproach(int[] nums){ 

        int n = nums.length;
        int missing = -1;
        int repeating = -1;

        // Check every number from 1 to N..........
        for(int i = 1; i <= n; i++) {

            int count = 0;

            // Count frequency of the number i in the array
            for(int j = 0; j < n; j++) {

                if(nums[j] == i) count++;
            }
            
            if(count == 0) missing = i;           // If the number appears 0 times, it is the missing number
            if(count > 1) repeating = i;           // If the number appears more than once,it is the repeating number
        }
        return new int[]{missing, repeating};       // Return Both Answers:- result[0] = missing number & result[1] = repeating number
    }


    public static int[] BetterApproach(int[] nums){
        int n = nums.length;
        int missing = -1;
        int repeating = -1;

        // Create a frequency array. This store the frequency of each number.
        int[] freq = new int[n + 1]; 

        for(int i=0; i<n; i++) {
            freq[nums[i]]++;
        }

        for(int i = 1; i <= n; i++){
            if(freq[i] == 0) missing = i;          // If the number appears 0 times, it is the missing number
            if(freq[i] > 1) repeating = i;         // If the number appears more than once, it is the repeating number
        }
        return new int[]{missing, repeating};
    }

    public static int[] OptimalApproach(int[] nums){
        int n = nums.length;

        long sumN = (long) n * (n + 1) / 2;                    // Sum of N natural numbers
        long sqsumN = (long) n * (n + 1) * (2 * n + 1) / 6;    // Square sum of N natural numbers

        // Calculate the sum and square sum of array elements
        long sum = 0;
        long sqsum = 0;

        for (int i = 0; i < n; i++) {
           sum += nums[i];
           sqsum += (long) nums[i] * nums[i];
        }

        // Now we can start forming our equations
        long diff = sum - sumN;             // x - y = diff --------> Therefor 1st equation............
        long sqdiff = sqsum - sqsumN;       // x² - y² = sqdiff

        // x² - y² = (x - y)(x + y)
        // We already know x - y = diff. Therefore, x + y = sqdiff / diff
        long sumxy = sqdiff / diff;     // -----------> Therefor 1st equation............

        // Now we have: x - y = diff & x + y = sumxy

        long repeating = (diff + sumxy) / 2;
        long missing = sumxy - repeating;

        return new int[]{(int) missing, (int) repeating};
    }

    public static void main(String args[]) {

        int[] nums = {4, 3, 6, 2, 1, 1};

        int[] result = BruteForceApproach(nums);
        System.out.println("Missing Number from the Sequence: " + result[0]);        // result[0] contains the missing number
        System.out.println("Repeating Number from the Sequence: " + result[1]);      // result[1] contains the repeating number  

        int[] result2 = BetterApproach(nums);
        System.out.println("Missing Number from the Sequence: " + result2[0]);       
        System.out.println("Repeating Number from the Sequence: " + result2[1]);

        int[] result3 = OptimalApproach(nums);
        System.out.println("Missing Number from the Sequence: " + result3[0]);       
        System.out.println("Repeating Number from the Sequence: " + result3[1]);
    }
}
