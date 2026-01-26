// 37. Rotate Array 
// Leetcode Problem : 189 - Right Rotation of Array by K times.
import java.util.Scanner;
public class RotateArray {
    
    static void Rotate1Time(int arr[], int n) {
        int temp = arr[0]; // store first element in temporary variable

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i]; // shift each element to the left by one position
        }
        arr[n - 1] = temp; // move the first element to the end of the array
    }

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of times to rotate the array: ");
        int k = sc.nextInt();

        int n = arr.length;
        
        //Rotate1Time(arr, n); 
        rotateKtimes(arr,n,k);

        System.out.println("Array after one rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
