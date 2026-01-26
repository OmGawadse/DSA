// 10.
// Sum of first n natural numbers :

import java.util.Scanner;
public class Sum_of_n_Naturalno {
    public static void main(String[] args) {

        try(Scanner sv = new Scanner(System.in)) {
        System.out.println("Enter a number : ");
        int n = sv.nextInt();

        int sum =0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + n + " natural numbers is : " + sum);
    }
}
}