// 71. Count Inversions in an array
// An inversion is a pair of indices (i, j) such that i < j and arr[i] > arr[j].
// Brute Force Approach: O(n^2) time complexity & O(1) space complexity
// Just compare each element with all the elements after it and count the number of inversions.

public class Count_Inversions {

    public static int BruteForceApproach(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
        }return count;
    }
    public static void  main(String[] args){
        int[] nums = {5,2,3,4,1};

        int count = BruteForceApproach(nums);
        System.out.println("The number of inversions in the array is: " + count);
    }
}
