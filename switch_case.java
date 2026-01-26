//6.
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number: ");
            int button = sc.nextInt();
/*
            if (button == 1) {
                System.out.println("Hello");
            } else if (button ==2) {
                System.out.println("Namaste");
            } else if (button ==3) {
                System.out.println("Bonjour");
            } else {
                System.out.println("Invalid Button");
            }
            }
    }
}
*/
//using Switch case it is easy to read and understand

  /*          switch (button) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println("Namaste");
                case 3 -> System.out.println("Bonjour");
                default -> System.out.println("Invalid Button");
            }
        }
    }
}
     */

     switch (button) {
        case 1:
            System.out.println("Hello");
            break;
        case 2:
            System.out.println("Namaste");
            break;
        case 3:
            System.out.println("Bonjour");
            break;
        default:
            System.out.println("Invalid Button"); 
        }
        }
    }
}