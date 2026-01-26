// 17.
// Find the minimum and maximum element in an array:

import java.util.*;

public class MinMax_inArray {
   public static void main(String args[]) {

      try(Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the Size of the array : ");
      int size = sc.nextInt();

      int arr[] = new int[size];
      
//input
      System.out.println("Enter the Elements in the array - ");
      for(int i=0; i<size; i++) {
        System.out.println("Enter number at index " + i + ": ");
        arr[i] = sc.nextInt();
      }

// logic to find min and max
      int max = arr[0];
      int min = arr[0];
     
       for(int i=0; i<size; i++) {
           if(arr[i] < min) {
               min = arr[i];
           }
           if(arr[i] > max) {
               max = arr[i];
           }
       }

       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
    }
   }
}


