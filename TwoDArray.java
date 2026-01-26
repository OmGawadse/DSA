// 18.
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows : ");
            int rows = sc.nextInt();
            System.out.println("Enter number of columns : ");
            int cols = sc.nextInt();

            //create 2D Array :
            int arr[][] =new int[rows][cols];

            //Input :
            System.out.print("Enter the values in Array: \n");
            for(int i = 0; i < rows; i++) {
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


        }
    }
    
}
