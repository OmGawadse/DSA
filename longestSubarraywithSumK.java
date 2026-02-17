// 48 .
// Longest Subarray with Sum K

import java.util.HashMap;

public class longestSubarraywithSumK {

    // 1️ Brute Force Approach - O(n^3)
    public static int bruteForce(int[] arr, int K) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                if (sum == K) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    // 2️ Better Approach - O(n^2)
    public static int betterApproach(int[] arr, int K) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == K) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    // 3️ Optimal Approach - O(n)
    public static int optimalApproach(int[] arr, int K) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == K) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - K)) {
                int len = i - map.get(sum - K);
                maxLen = Math.max(maxLen, len);
            }

            // store first occurrence only
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {1, -1, 5, -2, 3};
        int K = 3;

        System.out.println("Brute Force (O(n^3)) : " + bruteForce(arr, K));
        System.out.println("Better (O(n^2))      : " + betterApproach(arr, K));
        System.out.println("Optimal (O(n))       : " + optimalApproach(arr, K));
    }
}
/*
| Approach    | Time Complexity | Space |
| ----------- | --------------- | ----- |
| Brute Force | O(n³)           | O(1)  |
| Better      | O(n²)           | O(1)  |
| Optimal     | O(n)            | O(n)  |
 */