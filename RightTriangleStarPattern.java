public class RightTriangleStarPattern {
    
    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for printing stars
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
    public static void main(String[] args) {
        int n = 5; // Sample input
        printRightTriangle(n);
    }
}
