import java.util.Scanner;

public class QuickSort {
    public static void QuickS(int arr[], int s, int e){
        if(s < e){

            //Partitioning the Array & getting pivot Index.
            int pivotIndex = partition(arr, s, e);
 
            //Recursively Sorting the left and right subarrays.
            QuickS(arr, s, pivotIndex - 1);
            QuickS(arr, pivotIndex + 1, e);
            
        }
    }

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[s]; // Choosing the 1st element as pivot.
        int i = s; // Pointer for the smaller element.
        int j = e; // Pointer for the larger element.

        while(i < j){
            // Increment i until we find an element greater than the pivot.
            while(arr[i] <= pivot && i <= e){
                i++;
            }
            // Decrement j until we find an element less than or equal to the pivot.
            while(arr[j] > pivot){
                j--;
            }
            // If i is less than j, swap the elements at i and j.
            if(i < j){
                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Finally, swap the pivot element with the element at j.
        int temp = arr[s];
        arr[s] = arr[j];    
        arr[j] = temp;
        
        return j; // Return the pivot index.
    
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements of Array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        QuickS(arr, 0, n-1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        }
    }
}
