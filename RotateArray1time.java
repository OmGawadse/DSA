import java.util.Scanner;
public class RotateArray1time {
    
    static void Rotate1Time(int arr[], int n) {
        int temp = arr[0]; // store first element in temporary variable

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i]; // shift each element to the left by one position
        }
        arr[n - 1] = temp; // move the first element to the end of the array
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter number of times to rotate the array: ");
        //int k = sc.nextInt();

        int n = arr.length;
        
        Rotate1Time(arr, n); 

        System.out.println("Array after one rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

