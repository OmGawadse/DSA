// 31.
//Getting Occurence of an Element :
// We will be Doing same Problem Using Hashing.
import java.util.Scanner;

public class occurenseUsingFunction {
    static int count = 0;

    public static void occurence(int n, int x, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count += 1;
            }
        }
        System.out.println("Occurrence of " + x + ": " + count);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Size: ");
            int size = sc.nextInt();

            int arr[] = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Enter Array Elements: ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter Element to get Occurence: ");
            int x = sc.nextInt();

            // Get Elements to check Occurence:
            occurence(size, x, arr);
        }
    }
}
