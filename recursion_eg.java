// 27. Recursion Example
// Parameterized and Functional recursion.

import java.util.Scanner;
public class recursion_eg {

    // PROBLEM 1]- Print the sum of N numbers.
    // Parameterized recursion.(use it in Linked List, Stack, etc.)
    public static void problem1(int i,int n) {

        if(n<1){
            System.out.println(i);
        return;
        }

        problem1(i+n,n-1);
        // for Factorial :
        // problem1(i*n,n-1);
    }

    // Functional recursion.(Use it in Trees, etc.)

    public static int problem11(int n) {
        if(n == 0){
            return 0;
        }
        return n + problem11(n - 1);
        //for Factorial: 
        //return n * problem11(n - 1);
        //Just remember the base case, should be if(n==0) return 1;
        // for Fibonacci :
        // return problem11(n - 1) + problem11(n - 2);

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            
            problem1(0,n);
            problem11(n);
            System.out.println(problem11(n));
        }   
    }
}
