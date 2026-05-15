
public class CountSubarray_SumEquals_Zero {
    public static int BruteForceApproach(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                
                    if(sum == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String args[]){
        int[] arr = {1, -1, 2, 3, -2, 4, -4};
        int count = BruteForceApproach(arr);
        System.out.println("Count of subarrays with sum zero: " + count);  // 
    }
}