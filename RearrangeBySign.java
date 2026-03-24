// 55. Leetcode 

import java.util.Arrays;

public class RearrangeBySign {
    public static int[] BruteForceApproach(int[] arr){

        int n = arr.length;

//step 1: Seperate positive and negative elements.
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];    

        int posIndex = 0;
        int negIndex = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                neg[negIndex++] = arr[i]; 
            } else {
                pos[posIndex++] = arr[i];
            }
        }  

// step 2: Merge them back into the original array in the desired format(+,-,+,-,+,-,+....).
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos[i];       // in pos array, elements are present: 0, 1, 2,... but we want to place them at even indices: 0, 2, 4,...
                                       // wee ca see a pattern here.... which can be represented as 2*i where i is the index in the pos array i.e even indices
            arr[2 * i + 1] = neg[i];   // in neg array, elements are present: 0, 1, 2,... but we want to place them at odd indices: 1, 3, 5,...
                                        // wee ca see a pattern here.... which can be represented as 2*i + 1 where i is the index in the neg array i.e odd indices
        }
        
        
        /* 
        posIndex = 0;
        negIndex = 0;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){ // Even index
                arr[i] = pos[posIndex++];      // Positives go to even indices: 0, 2, 4...
            } else { // Odd index
                arr[i] = neg[negIndex++];      // Negatives go to odd indices: 1, 3, 5...
            }
        }
        */
        return arr;   
    }

    public static int[] OptimalApproach(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; // Our single result array
        
        int posIndex = 0; // Starts at the first even spot
        int negIndex = 1; // Starts at the first odd spot
        
        // A single pass through the original array
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[posIndex] = nums[i]; // Place the positive number
                posIndex += 2;           // Jump to the next even index
            } else {
                ans[negIndex] = nums[i]; // Place the negative number
                negIndex += 2;           // Jump to the next odd index
            }
        }

        return ans;
    }

    public  static void main(String args[]){
        int[] arr = {-2, 5, 8, -3, -7, 1};    // output ---> {5,   -2,   8,   -3,   1,   -7}
                                              // index ---->  0     1    2     3    4     5
                        // Positive elements are present at even indexes - 
                        // Negative elements are present at odd indexes - 
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] result = BruteForceApproach(arr);
        System.out.println("Rearranged Array: " + Arrays.toString(result));

        int[] optimalResult = OptimalApproach(arr);
        System.out.println("Rearranged Array (Optimal): " + Arrays.toString(optimalResult));
    }
}
