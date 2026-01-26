// 22.

//To be Continued......
import java.util.*;
public class patterns{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int start;
        for(int i=0;i<n;i++){
            
            if(i % 2 == 0){           // 0 % 2 = 0    i.e, even
                start = 1;
            }
            else{
                start = 0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
            }
        }
    }
}