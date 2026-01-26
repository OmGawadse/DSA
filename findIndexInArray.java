// 16.
// Take an input from the user.Search for the Given number & Print the index of that element.

import java.util.Scanner;

public class findIndexInArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter Size of Array : ");
            int size = sc.nextInt();

            // Creating an array and declaring size.
            int arr[] = new int[size];
            
            //System.out.println("Start Entering the elements in the array : ");
            for(int i=0; i<size; i++) {
                System.out.println("Enter number at index " + i + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the element to be searched : ");
            int x = sc.nextInt();              // x = element to be searched

            // Displaying our output.
            for (int i=0; i<size; i++) {
                if(x == arr[i]) {
                    System.out.println("Element "+ x +" found at Index :" + i);
                }
            }
        }
    }    
}
