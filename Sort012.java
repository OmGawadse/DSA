public class Sort012 {

    // 1) Brute Force Approach:- (Bubble Sort)
    public static void bruteForce(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // 2) Better Approach:- (Counting Sort)
    public static void betterApproach(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        for(int i = 0; i < arr.length; i++) {           // for(int i : arr) )
            if(arr[i] == 0) {
                count0++;
            }
            else if(arr[i] == 1) {
                count1++;
            }
            else{
                count2++;
            }
        }


        int index = 0;
// arr[index] = 0 ----> It stores 0 at the index position (starting from 0, As we have given index =0) 
// +++ ----> Then increments the index using the post-increment operator. So, it fills the array with 0s first, then 1s, and finally 2s based on the counts we calculated.
        
        for(int i = 0; i < count0; i++) {
            arr[index++] = 0;                      
        }

        for(int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }

        for(int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }
    }
    

    // Printing our results:
     public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 0, 2, 1, 1, 0};
        int[] arr2 = {2, 0, 2, 1, 1, 0};

        System.out.println("Brute Force (Bubble Sort): ");
        bruteForce(arr1);
        printArray(arr1);

        System.out.println("Better Approach (Counting Sort): ");
        betterApproach(arr2);
        printArray(arr2);
    }
}
