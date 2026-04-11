// 61. Leetcode 73. Set Matrix Zeroes
// Time Complexity for Brute Force Approach: O(n*m*(n+m)).

public class SetMatrixZeroes {

    // MAIN FUNCTION (Brute Force)
    public static void BruteForceApproach(int[][] arr) {

        int n = arr.length;    // total rows
        int m = arr[0].length; // total columns

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                // if we find 0 mark entire row and column as -1 (except 0)
                if(arr[i][j] == 0){

                    markRow(arr, i, m);
                    markColumn(arr, j, n);
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
        if(arr[i][k] != 0){
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

    public static void main(String[] args) {

        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Before:");
        printMatrix(arr);

        BruteForceApproach(arr);

        System.out.println("\nAfter:");
        printMatrix(arr);
    }
}