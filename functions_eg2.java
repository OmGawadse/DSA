// 14.
// Providing factorials of a number :
// 4! = 4*3*2*1 = 24

import java.util.Scanner;
public class functions_eg2 {
    public static void printfac(int n) {
    
        int fac = 1;
        for (int i = n; i >=1; i--) {
            fac = fac * i;
        }
        System.out.println(fac);   
    }

public static void main(String args[]){

    try(Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter n: ");
    int n = sc.nextInt();

    printfac(n);
}
}
}
