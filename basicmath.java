// 23.
//Countinhg number of digits in a number:

//import java.util.math.io;
import java.util.Scanner;
public class basicmath{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no: ");
            int n = sc.nextInt();

            int count= 0;
            while(n>0) {

                //if we want to extract digits: Use comented 2 lines below.......
                //int lastdigit = n%10;
                //System.out.println("Extracted Digit: " +lastdigit);
                
                n = n/10;
                count++;

                //int count1 = log10(n) + 1;  //log10(n) + 1 = number of digits in n
                //n = n/10;                 //n = n/10 removes last digit from n
            }
        System.out.println("Number of Digits: " +count);
        }      
    }
}

 //for(int i = 0; i=n; i++){  ........... for loop se possible nhi hai.