// 52. leetcode 169. Majority Element
// Majority element is the element that appears more than n/2 times in the array.

public class MajorityElement {

    // 1. Brute Force Approach (O(n^2) Time | O(1) Space)
    public static int majorityElementBrute(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2) return arr[i];
        }
        return -1;
    }


    // Main method to run and test in VS Code
    public static void main(String[] args) {
        // Test Case
        int[] arr = {2, 2, 1, 1, 1, 2, 2}; 

        System.out.println("--- Testing Majority Element Solutions ---");
        System.out.print("Input Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // Executing and printing results
        System.out.println("1. The Majority Element is(Brute Force):  " + majorityElementBrute(arr));
        
    }
}