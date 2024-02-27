public class MatrixAddition {
    
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrix addition not possible. Matrices must have the same dimensions.");
            return null;
        }
        
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return result;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2},
            {5, 3}
        };
        
        int[][] matrix2 = {
            {2, 3},
            {4, 1}
        };
        
        int[][] resultMatrix = addMatrices(matrix1, matrix2);
        
        if (resultMatrix != null) {
            System.out.println("Result of matrix addition:");
            printMatrix(resultMatrix);
        }
    }
}
