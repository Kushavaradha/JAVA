import java.util.Scanner;
public class matrix 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Entered Matrix:");
        printMatrix(matrix);

        scanner.close();
    }
    private static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int element : row) 
            {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}