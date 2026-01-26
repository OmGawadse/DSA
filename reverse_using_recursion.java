// 28. Reverse a String using Recursion.

import java.util.Scanner;
public class reverse_using_recursion {
    public static void ReverseArray(int i, int n, int arr[]) {      // Array = 0, 1, 2, 3, 4, 5
                        
        if(i >= n/2){               //2 - 2 matched ... so simply return, else continue.
            return;
        }

        int temp = arr[i];                      
        arr[i] = arr[n-i-1];        //At 0th index we'll put 4th (last) index E, at 1st i --> 3rd i E, at        
                                    // (i = 4)5-0-1 , (i=3)5-1-1 , (i=2)5-2-1 ... Terminate.
        arr[n-i-1] = temp;          // At 4th put 0th index E, at 3rd i --> 1st i E.           

        ReverseArray(i + 1, n,arr);
    }

    public static void rev(int arr[], int start, int end) {
        // Base case
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
 
        rev(arr, start + 1, end - 1);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Size of Elements : ");
            int size = sc.nextInt();                                            //size of array

            int arr[] = new int[size];
            //System.out.println(" Enter the Elements of Array : ");
            
            //Taking Inputs:
            for(int i = 0; i < size; i++) {
                System.out.println("Element at index "+ i +" : ");
                arr[i] = sc.nextInt();                                           //input elements in array
            }

            //Method 1:
            //ReverseArray(0,size,arr);
            rev(arr, 0, size - 1);
            


            //Printing Output
            System.out.println("Reversed values are " );
            for(int i = 0; i<size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


        
   