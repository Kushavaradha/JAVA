public class NumberPattern {

    // Function to print the specified pattern
    static void printNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print the current number repeatedly
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Specify the number of rows
        int numberOfRows = 4;

        // Print the specified pattern
        printNumberPattern(numberOfRows);
    }
}