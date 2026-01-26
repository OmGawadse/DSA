// 33. String Hashing.
// ASCII - American Standard Coding for Information Interchange. - intotal there are 256 character
// We can take 256 size of array, if we want to get the occurrence of upper, lower or any type of symbol.
// But if you want to specifically get only lower case occurrence, we can only use 26 array size that's is.
// A - 65 ..... Z - 90
// a - 97 ..... z - 122
// Imp Formula = 'a' - char   i.e  ---> a-a=0, d-a=3, f-a=5, a-a=0, a-a=0........Occurrence of a is 3.
// Q - character frequency counting.
import java.util.Scanner;

public class stringOccurrenceUsinghashing1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String: ");
            String s = sc.nextLine();

            // Pre-compute frequency
            int hash[] = new int[256];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i)]++;
            }

            // Query number of characters
            System.out.println("Enter number of characters to check: ");
            int n = sc.nextInt();

            // For each character, show frequency
            for (int i = 0; i < n; i++) {

                System.out.println("Enter character: ");
                char z = sc.next().charAt(0);                       // takes character input

                System.out.println(z + " Occures " + hash[z] + " times :) ");
            }
        }
    }
}
