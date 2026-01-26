//4.

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        //int number = 29;

        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
    }
}
