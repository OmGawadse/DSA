// 47 .
// Leetcode Problem no 136: Single Number.
// Every element appears twice except for one. Find that single one.
/*
| Function      | Meaning             |
| ------------- | ------------------- |
| put()         | Insert or update    |
| get()         | Get value           |
| containsKey() | Check if key exists |
| keySet()      | Get all keys        |
*/

import java.util.HashMap;

public class ElementThatAppearOnes {
    
    // -------------------- BRUTE FORCE --------------------
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int bruteForce(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            // Check how many times arr[i] appears
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If element appears only once, return it
            if (count == 1) {
                return arr[i];
            }
        }

        return -1; // safety return
    }
    
    // -------------------- BETTER (HASHMAP) --------------------
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int better(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Store frequency
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                // Increase frequency
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                // First time seeing element
                map.put(arr[i], 1);
            }
        }

        // Step 2: Find element with frequency 1
        for (int key : map.keySet()) {

            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
    // -------------------- OPTIMAL (XOR) --------------------
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int optimal(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        return result;
    }


    // -------------------- MAIN METHOD --------------------
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        System.out.println("Brute Force Answer: " + bruteForce(arr));
        System.out.println("Better (HashMap) Answer: " + better(arr));
        System.out.println("Optimal (XOR) Answer: " + optimal(arr));
        
    }
}