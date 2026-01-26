// 3.
//Check if the age is greater than or less than 18.

import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            
            System.out.println("Your age is: " + age);
            
            if(age > 18) {
                System.out.println("You are an Adult");
            }else{
                System.out.println("You are Not an Adult");
            }
        }
    }
    
}
