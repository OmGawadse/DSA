// 39.
// What ever is in comments is an alternative way of doing the same thing.

import java.util.*;
public class LinearSearch {
    public static int LinearSearch(int arr[], int x){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
                //System.out.println("Element found at index: " + i);
                //return;
            }
        }   
           //System.out.println("Element not found in the array");
           return -1; 
    }
    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 1, 9, 3};
        System.out.println("Array elements are: " + Arrays.toString(arr));
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the element to search:");
            int x = sc.nextInt();

            //LinearSearch(arr, x);

            int index = LinearSearch(arr, x);

            if (index != -1) {
                System.out.println("Element found at index: " + index);
            }
            else {
                System.out.println("Element not found in the array");
            }

        }
    }
}
