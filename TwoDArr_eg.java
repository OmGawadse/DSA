// 19.
//Take a matrix from the User. Search for a given number X and print the index at which it occurs.
import java.util.Scanner;

public class TwoDArr_eg {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows : ");
            int rows = sc.nextInt();
            System.out.println("Enter number of columns : ");
            int cols = sc.nextInt();

            //Create 2D Array :
            int arr[][] =new int[rows][cols];

            //Input :
            System.out.print("Enter the values in Array: \n");
            for(int i = 0; i < rows; i++) {
                System.out.println("Enter " + cols + " values for row " + (i + 1) + ":");
                for(int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            //Output :
            System.out.println("The values in the Array are : ");
            for(int i = 0; i < rows; i++) {
                for( int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            //Search for an element X :
            System.out.println("Enter the element to be searched : ");
            int x = sc.nextInt();

            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    if(arr[i][j] == x) {
                        System.out.println("Element " + x + " found at index (" + i + ", " + j + ")");
                        return; // Exit after finding the first occurrence
                    }
                }
            }
            boolean found = false;
                    if(!found) {
                        System.out.println("Element " + x + " not found in the array.");
                    }
        }
    }
}
