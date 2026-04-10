// 60. Leetcode 128. Longest Consecutive Sequence
// Time Complexity: O(n^2) for brute force approach.
// Time Complexity: O(n) for optimal approach using HashSet.

import java.util.Arrays;    
public class LongestConsecutiveSequence {

    // Method inside a method is not allowed in Java, so we define linearSearch as a separate method.
    public static boolean linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true; // found target
            }
        }
        return false; // target not found
    }

    public static int BruteForceApproach(int[] arr) {
        int n = arr.length;

        int longest = 1; // at least one element exists
        
        for(int i = 0; i < n; i++){
            int x = arr[i]; // current element
            int count = 1;  // sequence starts with 1

            // check for next consecutive elements
            while(linearSearch(arr, x + 1)) {
                x++;      // move to next element
                count++;  // increase sequence length
            }

            // update longest sequence
            longest = Math.max(longest, count);
        }

        return longest; // return answer
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////// Better Approach
    
    public static int BetterApproach(int[] arr) {
        int n = arr.length;

        int longest = 1; // at least one element exists & will give us answer
        int count = 1;   // sequence starts with 1

        Arrays.sort(arr);

        for (int i=1; i<n; i++) {
            if (arr[i] == arr[i-1]+1) {
                count++; // current element is consecutive, increase count
            }
            else if(arr[i] == arr[i-1]){
                continue; // skip duplicates
            }
            else{
                count = 1; // reset count for new sequence
            }
            longest = Math.max(longest, count); // update longest sequence
        }
        return longest; // return answer
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 12, 3, 55, 4, 11, 2, 1, 6};

        int result = BruteForceApproach(arr);
        int resultB = BetterApproach(arr);  

        System.out.println("Longest Consecutive Length Using Brute Force : " + result);
        System.out.println("Longest Consecutive Length Using Better Approach : " + resultB);
        
    }
}