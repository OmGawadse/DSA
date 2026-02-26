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
    
     public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 0, 2, 1, 1, 0};

        System.out.println("Brute Force: ");
        bruteForce(arr1);
        printArray(arr1);
    }
}
