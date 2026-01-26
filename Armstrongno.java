// 24.
//Armstrong Number :
//An Armstrong number is a number that is equal to the sum of cubes of its own digits.
//371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
//9474 = 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474
// Will only work for 3 digit numbers.

import java.util.Scanner;
public class Armstrongno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = sc.nextInt();
        int dup = n;
        int ano = 0;

        while(n>0){
            int lastdigit = n % 10;
            //System.out.println(lastdigit);
            ano = ano + (lastdigit * lastdigit * lastdigit);
            n = n / 10;
        }

        if(ano == dup){
                System.out.println("Armstrong number");
            }else{
                System.out.println("Not an Armstrong number");
            }
    }
}

// If you want to work for any number simply take the length in the string format.
// Use the math operator in which you will specifically use the power operator and simply multiplied that's it.