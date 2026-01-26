//// logic:
// swap 0 - min, 1 - min, 3 - min, 4 - min ............
// Range:- 0 to n-1, 1 to n-1, 2 to n-1, 3 to n-1, 4 to n-1 ........ So it will not consider previously sorted elements.

//Time Complexity :
// So every time it is: n + n-1 + n-2 + n-3 .......... Since i is incrementing. i.e range.
// so it's natural number = n(n+1)/2 .....n^2/2  +  n/2 ....ignore Constant.
// Time Complexity = n^2.

import java.util.*;
public class Sorting {

    public static void selection_sort(int[] arr, int n) {
        // n = 5
        // array = [5, 9, 3, 7, 1] ..... 
        // Sorted Array : 1, 3, 5, 7, 9 .......
        for(int i = 0; i < n-1; i++){                       
            int mini = i;                                   // 5
            for(int j = i+1; j < n; j++){                   // 5..9..3..7..1
                if(arr[mini] > arr[j]){                     // 5 > all greater number so skip
                    mini = j;                               // The next mini will be j value index
                }
            }
            // Swapping Logic
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

// Pushers the Maximum to Last, using adjacents swapping.
// i.e, 0 - 1(index)........ No need to check 1st element as it is already sorted.
// Similarly, 
// Time Complexity : O(n^2)
    public static void bubble_sort(int[] arr, int n) {

        for(int i = 0; i < n-1; i++){                       // 5               - .....3
            for(int j = 0; j < n-i-1; j++){                   // 5..9..3..7..1
                if(arr[j] > arr[j+1]){                       // 5 > 9 (No) | 9 > 3 (Yes) | 9 > 7 (Yes) | 9 > 1 (Yes)
                    // Swapping Logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertion_sort(int arr[], int n) {
        for(int i = 1; i < n; i++){

            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            // Placement of current
            arr[j + 1] = current;
        }
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)) {

            // Size input
            System.out.println("Enter Size:");
            int n = sc.nextInt();

            // Array input 
            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                System.out.println("Enter Elements: ");
                arr[i] = sc.nextInt();
            }

            // Function Calling
            //selection_sort(arr,n);
            bubble_sort(arr,n);
            //insertion_sort(arr,n);

            // Array Output 
            System.out.println("\nSorted Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
