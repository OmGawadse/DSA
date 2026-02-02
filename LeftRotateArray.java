// 38. Left Rotate Array by K times
// step one: reverse first k elements
// step two: reverse remaining n-k elements
// step three: reverse entire array

import java.util.Scanner;
public class LeftRotateArray {

    public static void LeftrotateKtimes(int[] arr,int n, int k) {
        
        k = k % n;   // handle large k

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of times to rotate the array: ");
            int k = sc.nextInt();

            int n = arr.length;
        
            LeftrotateKtimes(arr,n,k);

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}