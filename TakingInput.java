// 2. 
//Take two numbers and Print the sum:
import java.util.*;

public class TakingInput {
    public static void main(String[] args) {

            try (Scanner sc = new Scanner(System.in)) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int sum = a + b;
            System.out.println(sum);
        }
    }
}
//System.out.println("Enter first number: ");
//System.out.println("Enter second number: ");
