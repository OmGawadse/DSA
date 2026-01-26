// 34.
// logic not cleared, bcoz of syntax.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class OccurrenceUsingMapping {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){

            //Taking Basic Input:
            System.out.println("Enter the Number of Elements to Enter: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter Element "+ i +" :  ");
                arr[i] = sc.nextInt();
            }

            // Pre-Compute using HashMap
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                // increment count if already exists, else put 1
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            //Taking Queue:
            System.out.println("Enter the Number of Elements to check the Occurrence : ");
            int q = sc.nextInt();

            for (int i = 0; i < q; i++) {
                System.out.print("Enter number to check occurrence: ");
                int num = sc.nextInt();
                //Fetch: 
                System.out.println("Occurrence of " + num + " = " + map.getOrDefault(num, 0));
            }
        }
    }
}
