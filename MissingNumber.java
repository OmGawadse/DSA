// 45. Missing Number

public class MissingNumber {

    // Method 1: Using Sum Formula
    public static int findMissingUsingSum(int[] arr, int n) {

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }

    // Method 2: Using XOR
    public static int findMissingUsingXOR(int[] arr, int n) {

        int xor1 = 0;
        int xor2 = 0;

        // XOR from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR of array elements
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5;  // Numbers are from 1 to 5

        System.out.println("Missing Number using Sum: " + 
                findMissingUsingSum(arr, n));

        System.out.println("Missing Number using XOR: " + 
                findMissingUsingXOR(arr, n));
    }
}
