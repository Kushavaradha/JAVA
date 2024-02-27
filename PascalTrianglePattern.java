public class PascalTrianglePattern {
    
    public static void printPascalTriangle(int n) {
        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Print spaces for formatting
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            
            int number = 1;
            // Calculate and print values for each row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    number = 1;
                } else {
                    number = number * (i - j + 1) / j;
                }
                System.out.printf("%-4d", number);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 5; // Number of rows for the pattern
        printPascalTriangle(n);
    }
}
