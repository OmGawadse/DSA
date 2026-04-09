// 59. Leaders in an array
// An element is a leader if it is greater than all the elements to its right side. 
// The rightmost element is always a leader.
// Time Complexity: O(n^2) for brute force.
// Time Complexity: O(n) for optimal approach.

import java.util.*;

public class LeadersInArray {

    // Function to find leaders in array using brute force
    public static List<Integer> BruteForceApproach(int[] arr) {
        List<Integer> result = new ArrayList<>(); // to store leaders
        int n = arr.length;

        // Traverse each element
        for(int i = 0; i < n; i++) {

            // Step 1: Assume current element is leader
            boolean Leader = true;

            // Step 2: Check elements on right side
            for(int j = i + 1; j < n; j++) {

                // If any element is greater, current is NOT leader
                if(arr[j] > arr[i]) {
                    Leader = false;
                    break; // no need to check further
                }
            }
            // Step 3: If still true → it is a leader
            if(Leader) {
                result.add(arr[i]);
            }
        }
        return result; // return list of leaders
    }

    public static List<Integer> OptimalApproach(int[] arr) {
        List<Integer> result = new ArrayList<>(); 
        int n = arr.length;
        int max = arr[n-1]; // rightmost element is always a leader
        result.add(max); // add rightmost element to result

        // traverse backwards:
        for(int i = n-2; i >=0; i--){
            if(arr[i] > max) { 
                max = arr[i]; // update max
                result.add(max); // add new leader to result                
            }
        }
        return result;
    }
        
public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter elements:");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Call function to get leaders
            List<Integer> result = BruteForceApproach(arr);
            List<Integer> returnresult = OptimalApproach(arr);

            System.out.println("Leaders in array (Brute Force):");
            for(int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("Leaders in array (Optimal):");
            for(int num : returnresult) {
                System.out.print(num + " ");
            }
        }
    }
}