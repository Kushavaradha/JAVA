import java.util.Scanner;

public class RectangleSymbolPattern {
    
    public static void printRectangle(int rows, int cols, char symbol) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the symbol for the rectangle pattern: ");
        char symbol = scanner.next().charAt(0);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        System.out.println("Rectangle Pattern:");
        printRectangle(rows, cols, symbol);
        
        scanner.close();
    }
}
