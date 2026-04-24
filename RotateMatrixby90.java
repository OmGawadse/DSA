// 62. Rotate Matrix by 90 Degrees.
// Given an n x n 2D matrix(Image), rotate the image by 90 degrees(clockwise).
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
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        BruteForceApproach(matrix);

        // Print the rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
