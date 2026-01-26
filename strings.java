// 20. 
// Strings are IMMUTABLE : Cannot be Modified.

import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a String: ");
           
            //considers spaces as well, i.e prints whole line.
            String name = sc.nextLine();

            System.out.println("Your String is : " + name);

            //  *Concatenation ...............
            String a = "Ghatak";
            String b = "Om GGMU";
            String s = a +" "+ b;
            System.out.println(s);

            // *Length Fuction.
            System.out.println("length is :" + s.length());

            // * charAt : Prints Every charater Individually.
            for(int i = 0; i<s.length(); i++){
                System.out.println("Characters at Index " + i +": " + s.charAt(i));
            }
            // Compare :
            //a > b : +ve value.
            //a < b : -ve Value.
            //a = b : 0.

            if(a.compareTo(b) == 0){
                System.out.println(" Strings are Equal");
            }else{
                System.out.println(" strings are not Equal");
            }
        
            // substring : Gives the specific part from a String.
            
            String sen = "My Name is Om Gawadse";
            String subs = sen.substring(11,sen.length());
            String subss = sen.substring(3,7);
            System.out.println(subs);
            System.out.println(subss);
            
        }
    }
}
