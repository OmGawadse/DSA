// 7. 
// Make a Calculator. Take 2 numbers (a & b) from the user

import java.util.Scanner;

public class calculator {    
    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();

            System.out.println("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Enter the operation you want to perform (+, -, *, /, %): ");
            char op = sc.next().charAt(0);
            int ans;
            switch (op) {
                case '+':
                    ans = a + b;
                    break;
                case '-':
                    ans = a - b;
                    break;
                case '*':
                    ans = a * b;
                    break;
                case '/':
                    ans = a / b;
                    break;
                case '%':
                    ans = a % b;
                    break;
                default:
                    System.out.println("Invalid operation");
                    return;
            }
            System.out.println("The answer is: " + ans);
        }
    }
}

