// 5.
//Code for equal, less, & Greater than operator :

import java.util.Scanner;
public class ComparissionEGL {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();

            if(a == b) {
                System.out.println("Both numbers are equal");
            } else if(a > b) {
                System.out.println(a + " is greater than " + b);
            } else {
                System.out.println(a + " is less than " + b);
            }
        }
    }
}

