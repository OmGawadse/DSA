// 26.
//Recursion : When a function calls itself until a base/specified condition is met.
//In this example we will see how to avoid stack overflow error using base condition.
//1.} print numbers from 1 to N.  
//2.} print linearly from 1 to N.  
//3.} print from N to 1.
//4.} print Linearly from 1 to N by back track. i.e i + 1 not Allowed.
//5.} print from N to 1 by back track.


import java.util.*;
public class recursion {
    static int cnt = 0;
    public static void avoidstactoverflow() {

        if(cnt == 3){
            return;
        }
        System.out.println(cnt);
        cnt++;
        avoidstactoverflow();
    }


    // PROBLEM 1]
    public static void problem1(int i, int n) {
        if(i > n){
            return;
        }
        System.out.println("Om Amar Gawadse / i");
        problem1(i+1,n);
    }


    // PROBLEM 2]
    public static void problem2(int i, int n) {
        if(i > n){
            return;
        }
        System.out.println(i);
        problem2(i+1,n);
    }


     // PROBLEM 3]
    public static void problem3(int n) {
        if(n < 1){
            return;
        }
        System.out.println(n);
        problem3(n - 1);

    }


    // PROBLEM 4] ----  3 ~ 2 ~ 1 ~ 0 -> backtrack & now prints -> 1 ~ 2 ~ 3
    public static void problem4(int x, int n) {
        if(x < 1){
            return;
        }
        problem4(x--,n);
        System.out.println(x);

    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Till where you want to print ? \nEnter Number: ");
        int n = sc.nextInt();

        //avoidstactoverflow();
        //problem1(1,n);
        //problem2(1,n);
        problem3(n);
        //problem4(n,n);

        
        }
    }
}
