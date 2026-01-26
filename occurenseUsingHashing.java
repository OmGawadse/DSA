// 32. Number Hashing.
// Hashing is a process that transforms i/p Data(text, numbers, files) into a fixed-size (Value)string of characters-hash value/hash code. 
// This transformation is performed using a mathematical algorithm known as a hash function.
// Q = Getting Occurence of MULTIPLE Element using hashing:
// arr[10^6] is max for integer & //arr[10^7] is max for declaring Globally.
// arr[10^7] is max for Bool & //arr[10^8] is max for declaring Globally.

import java.util.Scanner;

public class occurenseUsingHashing {
    //Globally
    // So if you are declaring globally no need to Mention Below.
    //int hash[10000000];

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Step 1: Input Array Size
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();

            // Step 2: Input Array Elements
            int arr[] = new int[size];                                          
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // Step 3: Precompute occurrences using hashing
            // Assuming elements are between 0 and 11 (since hash[12])
            int hash[] = new int[12];                                    //int hast[] = new int[1000000] .....Max
            for (int i = 0; i < size; i++) {
                hash[arr[i]] += 1;
            }

            // Step 4: Query occurrences
            System.out.println("\nEnter number of queries: ");
            int q = sc.nextInt();

                for (int i = 0; i < q; i++) {
                System.out.print("Enter number to check occurrence: ");
                int num = sc.nextInt();

                //Fetch
                if (num >= 0 && num < 12) {
                    System.out.println("Occurrence of " + num + " = " + hash[num]);
                } else {
                    System.out.println("Number out of range (0–11)");
                }
            }
        }
    }
}

/* 
Example:

If arr = {1, 2, 2, 3}

Then:

hash[1] = 1
hash[2] = 2
hash[3] = 1
*/