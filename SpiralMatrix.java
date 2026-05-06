public class SpiralMatrix {

    public static void printSpiral(int[][] matrix) {

        int top = 0;                          
        int bottom = matrix.length - 1;       
        int left = 0;                         
        int right = matrix[0].length - 1;     

        while (top <= bottom && left <= right) {

            // left → right 
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // top row is done, move it down

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // right column is done, move it left

            // right → left
            // (only if rows are still left)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // bottom row is done, move it up
            }

            // bottom → top
            // (only if columns are still left)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // left column is done, move it right
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        printSpiral(matrix);
    }
}