import java.util.Scanner;

public class  {
    
    public static void printPattern(char ch, int maxTimes) {
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the character to be printed: ");
        char ch = scanner.next().charAt(0);
        
        System.out.print("Max Number of times to be printed: ");
        int maxTimes = scanner.nextInt();
        
        System.out.println("Pattern:");
        printPattern(ch, maxTimes);
        
        scanner.close();
    }
}