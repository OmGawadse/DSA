// 38. Rotate Array 
// Leetcode Problem : 189 - Right Rotation of Array by K times.
// Step 1: Reverse Entire array
// Step 2: Reverse first k elements
// Step 3: Reverse remaining n-k elements

import java.util.Scanner;
public class RightRotateArray {
    
    public static void rotateKtimes(int arr[],int n,int k) {
        k = k % n;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr, s+1, e-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of times to rotate the array: ");
            int k = sc.nextInt();

            int n = arr.length;
        
            rotateKtimes(arr,n,k);

            System.out.println("Array after right rotation by " + k + " times:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}