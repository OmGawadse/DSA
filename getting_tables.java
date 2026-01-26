// 11.
//Taking input from the user and providing the table of it :
import java.util.Scanner;
public class getting_tables {
    public static void main(String[] args) {

        try(Scanner sv = new Scanner(System.in)) {
        System.out.println("Enter a number : ");
        int n = sv.nextInt();

        int table;

        for (int i = 1; i <11 ; i++) {
            table = n*i;
             System.out.println("2 * "+ i +" = "+ table);
        }
       
    }
}
}