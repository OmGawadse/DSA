// 13.
// Sum of Numbers

import java.util.*;

public class functions_eg {
    public static int sumOf_a_b(int a, int b) {
        int sum = a+b;
       // System.out.println("Sum is : " + sum);      we can also do : return a +b; Directly.
        return sum;
    }

public static void main(String args[]){

    try(Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter a : ");
    int a = sc.nextInt();

    System.out.println("Enter b : ");
    int b = sc.nextInt();

    // We are calling the function here and printing it here :
    int c = sumOf_a_b(a, b);
    System.out.println("Returned value is : " + c);
}
}
}
