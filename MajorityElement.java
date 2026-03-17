// 52. leetcode 169. Majority Element
// Majority element is the element that appears more than n/2 times in the array.

import java.util.HashMap;

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

    // 2. Better Approach using Hashing (O(n) Time | O(n) Space)
    public static int majorityElementBetter(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

            if (map.get(arr[i]) > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // Test Case
        int[] arr = {2, 2, 1, 1, 1, 2, 2}; 

        System.out.println("--- Testing Majority Element Solutions ---");
        System.out.print("Input Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // Executed with your requested print format
        System.out.println("1. The Majority Element is (Brute Force): " + majorityElementBrute(arr));
        System.out.println("2. The Majority Element is (Better): " + majorityElementBetter(arr));
 
    }
}