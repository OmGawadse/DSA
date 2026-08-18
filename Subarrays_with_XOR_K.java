// 69. Subarrays with XOR K
//import java.util.*;


public class Subarrays_with_XOR_K {

    public static int BruteForceApproach(int[] nums, int K) {
        int n = nums.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xor = 0;
                for(int k = i; k<j; k++){
                    xor = xor ^ nums[k];
                }

                // If XOR of current subarray is K, increase count
                if (xor == K) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;

        int result = BruteForceApproach(nums, k);

        System.out.println("Number of subarrays with XOR " + k + " = " + result);
    }
}