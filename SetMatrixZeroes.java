// 61. Leetcode 73. Set Matrix Zeroes
// Time Complexity for Brute Force Approach: O(n*m*(n+m)). Space Complexity for Brute Force Approach: O(1).
// Time Complexity for Better Approach: O(n*m). Space Complexity for Better Approach: O(n+m).
// Time Complexity for Optimal Approach: O(n*m). Space Complexity for Optimal Approach: O(1).

public class SetMatrixZeroes {

    // Brute Force Approach: convert element to -1 & then back to 0.
    public static void BruteForceApproach(int[][] arr) {

        int n = arr.length;    // total rows
        int m = arr[0].length; // total columns

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                // if we find 0 mark entire row and column as -1 (except 0)
                if(arr[i][j] == 0){
                    markRow(arr, i, m);      // |
                    markColumn(arr, j, n);   // _
                }
            }
        }
        // change all -1 to 0
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    // mark entire row as -1 (except 0)
    public static void markRow(int[][] arr, int i, int m) {
        for(int k = 0; k < m; k++){   // using k here
            if(arr[i][k] != 0){       // Any other element apart from 0 which we want to convert it to 0.
                arr[i][k] = -1; // mark for later
            }
        }
    }

    // mark entire column as -1 (except 0)
    public static void markColumn(int[][] arr, int j, int n) {
        for(int k = 0; k < n; k++){   // using k here
            if(arr[k][j] != 0){
                arr[k][j] = -1; // mark for later
            }
        }
    }

    // print matrix
    public static void printMatrix(int[][] arr){
        for(int[] row : arr){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // BETTER APPROACH: 
    // Intuition: He was simply assume two separate Array. Which will help us to keep track of the elements that we want to change.

    public static void BetterApproach(int[][] arr) {

        int n = arr.length;    // total rows
        int m = arr[0].length; // total columns

        int[] row = new int[n]; // Create Array to mark rows
        int[] col = new int[m]; // Create Array to mark columns

        // Traverse matrix and mark rows & columns
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    row[i] = 1; // mark this row
                    col[j] = 1; // mark this column
                }
            }
        }

        // Traverse again and set values to 0
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                
                // if row OR column is marked → make it 0
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    // OPTIMAL APPROACH:
    // Intuition: We can use the first row and first column of the matrix itself to mark the rows and columns that we want to change. This way we can achieve O(1) space complexity.

    public static void OPTIMALApproach(int[][] arr){
        int n = arr.length;   
        int m = arr[0].length;
        
        int row0 = 1; // to check if first row has any 0
        int col0 = 1; // to check if first column has any 0

        // Check the 1st row and 1st column, if they have any 0, then mark row0 and col0 as 0 respectively.
        for (int i = 0; i < m; i++) {   // switched variable (column traversal)
            if(arr[0][i] == 0){
                row0 = 0; // mark first row
            }
        }
        for (int j = 0; j < n; j++) {   // switched variable (row traversal)
            if(arr[j][0] == 0){
                col0 = 0; // mark first column
            }
        }

        // in Mini matrix(Inner Matrix), if we find 0, then mark the corresponding row and column in the first row & column.
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[i][j] == 0){
                    arr[0][j] = 0; // mark column in first row
                    arr[i][0] = 0; // mark row in first column
                }
            }
        }

        // Traverse the first row and first column to set the values to 0 in the mini matrix.
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[0][j] == 0 || arr[i][0] == 0){
                    arr[i][j] = 0;
                }
            }
        }

        // Finally, set the first row and first column to 0 if row0 or col0 is 0 respectively.
       if(row0 == 0){
        for (int i = 0; i < m; i++) {   
            arr[0][i] = 0;
        }
    }

    if(col0 == 0){
        for (int j = 0; j < n; j++) {  
            arr[j][0] = 0;
        }
    }
}

    public static void main(String[] args) {

        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        BruteForceApproach(arr);
        System.out.println("Answer for Brute Force Approaach: ");
        printMatrix(arr);

        arr = new int[][] {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1},
            {0, 0, 1},
        };

        BetterApproach(arr);
        System.out.println("Answer for Better Approaach: ");
        printMatrix(arr);

        int[][] arr1 = new int[][] {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1},
            {0, 0, 1},
        };

        OPTIMALApproach(arr1);
        System.out.println("Answer for Optimal Approaach: ");
        printMatrix(arr1);
    }
}