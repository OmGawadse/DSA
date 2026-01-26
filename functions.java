// 12.
import java.util.*;

public class functions {
    public static void printmyname(String name) {
        System.out.println("Your name is : "+ name);
        //return;
    }

public static void main(String args[]){

    try(Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter Your Name : ");
    String n = sc.next();

    printmyname(n);
}
}
}
