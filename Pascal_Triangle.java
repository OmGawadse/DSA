// 65 : Pascal Triangle 
// We will be answering 3 important Questions regarding Pascal Triangle :
// 1. given is Rows and Columns, Just Find the Element at that position.
// 2. Print the nth Row of Pascal Triangle.
// 3. Print the whole Pascal Triangle.

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {

    // Question 1 : Find the element at given row and column: TC = 
    public static int getElement(int row, int col){
        return funcNcR(row-1, col-1);
    }
    // Lets write the Function:
    public static int funcNcR(int n, int r){
        int ans = 1;
        for(int i=0; i<r; i++){
            ans = ans * (n-i);
            ans = ans / (i+1);
        }
        return ans;
    }

    // Question 2 : Print the nth Row of Pascal Triangle.
    public static int getRowElement(int row, int col){
        return funcForEntireRow(row-1, col-1);
    }
    // Lets write the Function:
    public static int funcForEntireRow(int n, int r){
        int ans = 1;
        for(int i=0; i<r; i++){
            ans = ans * (n-i);
            ans = ans / (i+1);
        }
        return ans;
    }

    // Question 3 : Print the whole Pascal Triangle.
    public static List<List<Integer>> PascalTriangle(int N){
        
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            List<Integer> row = new ArrayList<>();

            // Every row starts with 1
            row.add(1);

            if (i > 0) {

                // Get the previous row
                List<Integer> prevRow = result.get(i - 1);

                // Calculate the middle elements
                for (int j = 1; j < i; j++) {
                    int x = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(x);
                }

                // Every row after the first ends with 1
                row.add(1);
            }

            // Add the completed row to the result
            result.add(row);
        }

        return result;
    }


    public static void main(String args[]){
        
        int row = 5;
        int col = 2;

        // Question 1 : Find the element at given row and column
        System.out.println("Element at Row " + row + " and Column " + col + " is : " + getElement(row, col));

        // Question 2 : Print the nth Row of Pascal Triangle.
        //System.out.print("Row " + row + " of Pascal Triangle is : ");
        for(int i=1; i<=row; i++){
            System.out.print(getRowElement(row, i) + " ");
        }

        // Question 3 : Print the whole Pascal Triangle.
        int N = 5;
        List<List<Integer>> answer = PascalTriangle(N);
        System.out.println(answer);
    }    
}
