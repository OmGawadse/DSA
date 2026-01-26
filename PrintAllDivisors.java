// 25.
// Q ---> Write a program to print all the divisors/ Factors of a number.
// 30 -----> 1 2 3 5 6 10 15 30

import java.util.*;
public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = sc.nextInt();
        System.out.println("All divisors of " + n + " are: ");
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
