import java.util.Scanner;

public class HollowSquarePattern {
    
    public static void printHollowSquare(int rows, char symbol) {
        // Print first row
        for (int i = 1; i <= rows; i++) {
            System.out.print(symbol + " ");
        }
        System.out.println();
        
        // Print middle rows
        for (int i = 2; i <= rows - 1; i++) {
            System.out.print(symbol + " ");
            for (int j = 2; j <= rows - 1; j++) {
                System.out.print("  ");
            }
            System.out.println(symbol);
        }
        
        // Print last row
        for (int i = 1; i <= rows; i++) {
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the hollow square pattern: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the symbol for the hollow square: ");
        char symbol = scanner.next().charAt(0);
        
        System.out.println("Hollow Square Pattern:");
        printHollowSquare(rows, symbol);
        
        scanner.close();
    }
}
