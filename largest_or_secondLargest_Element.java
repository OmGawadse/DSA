// 34.
// program to find the largest element in an array.
// we can use sorting method also to find the largest element but that will take more time complexity, i.e n(log n).
// so we will use linear search method to find the largest element in the array.
// Time Complexity: O(n) 
import java.util.Scanner;

public class largest_or_secondLargest_Element {
    
    public static int Largest_Element(int arr[], int n){

        int largest = arr[0]; // assume first element is the largest

        for (int i = 0; i < n; i++) { // traverse entire array
            if (arr[i] > largest) {  // if current element is larger
                largest = arr[i];    // update largest
            }
        }

        return largest; // return the final largest element
    }


    public static int slargest(int arr[], int n) {
        int largest = arr[0];
        int secondLargest = -1;  // For largest element -1 will work as we are assuming all elements are non-negative.
        // If negative elements are also present, we can initialize secondLargest to Integer.MIN_VALUE.
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];                
            }
        }
        return secondLargest;
    }

    public static int Smallest_Element(int arr[],  int n) {
        int smallest = arr[0];

        for(int i = 0; i < n; i ++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int sSmallest(int arr[], int n){
        int smallest = arr[0];
        int secondsmallest = Integer.MAX_VALUE; 

        for (int i = 1; i < n; i++) {
            if(arr[i] < smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i] < secondsmallest){
                secondsmallest = arr[i];
            }    
        }
        return secondsmallest;
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();        
            }

            int largest = Largest_Element(arr, n); 
            int secondLargest = slargest(arr, n);

            int smallest = Smallest_Element(arr, n);
            int secondsmallest = sSmallest(arr, n);

            System.out.println("The largest element in the array is: " + largest);
            System.out.println("The second largest element in the array is: " + secondLargest);
            System.out.println("The Smallest Element in the Array is: " + smallest);
            System.out.println("The Second Smallest Element in the Array is: " + secondsmallest);
        }
    }
}

