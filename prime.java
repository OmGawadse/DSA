//26.
// Q ---> Write a program to print if the number is prime or not.
/// wrong logic ----------- skip
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = sc.nextInt();
        int dup = n;

            if(n > 0){
                if(n % 1 == 0 && n % n == 0){
                    System.out.println(dup + " is a prime number");
                }
                else{
                    System.out.println(dup + " is not a prime number");
                }
            }
        }
    }