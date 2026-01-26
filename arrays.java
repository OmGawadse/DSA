// 15.
/*
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter Size of Array : ");
            int size = sc.nextInt();

            // to declare the size of the variant following is the syntax

            int num[] = new int[size];
            
            int i;
            // input
            for(i = 0; i<size; i++) {
               num[i] = sc.nextInt();
            }

            // output
            for(i = 0; i<size; i++) {
                System.out.println("Entered Values in Array are : " + num[i]);
            }
        }
    }
} */

import java.util.*;


public class arrays {
   public static void main(String args[]) {
       try(Scanner sc = new Scanner(System.in)) {
         System.out.println("Enter size of array: ");
       int size = sc.nextInt();

       int num[] = new int[size];  // Here we creating an array(Name=num) & giving size(size=User-Defined)

       for(int i=0; i<size; i++) {                //we are accepting the elements.
           System.out.println("Enter number at index " + i + ": ");
           num[i] = sc.nextInt();
       }

       //print the numbers in array
       for(int i=0; i<num.length; i++) {
           System.out.print(num[i] + " ");
       }
   }
}
}