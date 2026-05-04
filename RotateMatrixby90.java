// 62. Rotate Matrix by 90 Degrees.
// Given an n x n 2D matrix(Image), rotate the image by 90 degrees(clockwise).
// Time Complexity of Brute Force Approach: O(n^2)  

public class RotateMatrixby90 {

    public static void BruteForceApproach(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];    // Create a new matrix to store the rotated values.

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];    // Rotate the elements by assigning them to the new positions in the rotated matrix.
            }
        }
        // Copy the rotated matrix back to the original matrix.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = rotatedMatrix[i][j];
            }
        }
    }

    public static void OptimalApproach(int [][] matrix) {
        int n = matrix.length;

        // Transpose the matrix :

        for(int i=0; i<n; i++){
            for(int j=i+1; j< n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row of the transposed matrix :
        for (int i=0; i<n; i++) {
            int left = 0, right = n-1;
            while (left < right) { 
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Brute Force Result:");
        BruteForceApproach(matrix1);
        printMatrix(matrix1);

        System.out.println("\nOptimal Result:");
        OptimalApproach(matrix2);
        printMatrix(matrix2);
    }
}