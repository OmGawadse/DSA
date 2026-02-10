// 44.
// Union of two Sorted Arrays: We will be strictly using the two-pointer technique here.
// Time Complexity = O(m + n) where m and n are the sizes of the two arrays
// Space Complexity = O(1) if we don't count the output array.
// If we count the output array, then Space Complexity = O(m + n) in the worst case when there are no common elements.

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfSortedArray {

    // Function to find the union of two sorted arrays
    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {

        // ArrayList to store the union elements
        ArrayList<Integer> union = new ArrayList<>();

        // Two pointers for both arrays
        int i = 0, j = 0;

        // Traverse both arrays until one of them ends
        while (i < arr1.length && j < arr2.length) {

            // Case 1: Both elements are equal
            if (arr1[i] == arr2[j]) {

                // Add element if it is not a duplicate
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }

            // Case 2: Element of first array is smaller
            else if (arr1[i] < arr2[j]) {

                // Add element if it is not a duplicate
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }

            // Case 3: Element of second array is smaller
            else {

                // Add element if it is not a duplicate
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of first array
        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of second array
        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        // Return the union list
        return union;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Input first array
            System.out.print("Enter size of first array: ");
            int n = sc.nextInt();
            int[] arr1 = new int[n];

            System.out.println("Enter elements of first array (sorted):");
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            // Input second array
            System.out.print("Enter size of second array: ");
            int m = sc.nextInt();
            int[] arr2 = new int[m];

            System.out.println("Enter elements of second array (sorted):");
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            // Call union function
            ArrayList<Integer> unionResult = union(arr1, arr2);

            // Print the union
            System.out.println("Union of two sorted arrays:");
            for (int num : unionResult) {
                System.out.print(num + " ");
            }
        }
    }
}