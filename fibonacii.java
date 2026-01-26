// 30. 
// Leetcode :-  509
// 0 , 0+1 , 1+1 , 1+2 , 2+3 , 3+5 , 8+5, 13+8 , 21+13 ....
// 0 , 1, 1, 2, 3, 5, 8, 13, 21, 34, ....
// Fn = Fn-1 + Fn-2, where n > 1

import java.util.*;
public class fibonacii {
    public static int fib(int n) {

        //Base/Stop Case:
        if(n <= 1){
            return n;
        }
        
        int last = fib(n-1);
        int slast = fib(n-2);

        return last + slast;
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Number: ");
            int n = sc.nextInt();

            int result = fib(n);
            System.out.println(" Fibonacci number at "+n+" position: " +result);

        }
    }
}
