// 65 : Pascal Triangle 
// We will be answering 3 important Questions regarding Pascal Triangle :
// 1. given is Rows and Columns, Just Find the Element at that position.
// 2. Print the nth Row of Pascal Triangle.
// 3. Print the whole Pascal Triangle.

public class Pascal_Triangle {

    // Question 1 : Find the element at given row and column
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
 
    public static void main(String args[]){
        
        int row = 5;
        int col = 2;

        // Question 1 : Find the element at given row and column
        System.out.println("Element at Row " + row + " and Column " + col + " is : " + getElement(row, col));
    }    
}
