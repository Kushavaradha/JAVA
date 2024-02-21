import java.util.Scanner;

public class RectangularStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloums: ");
        int co = sc.nextInt();
        

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= co; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}