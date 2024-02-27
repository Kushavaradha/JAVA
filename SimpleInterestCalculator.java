import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {.  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        System.out.print("Is the customer a senior citizen (y/n): ");
        char seniorCitizen = scanner.next().charAt(0);
        
        double rateOfInterest = seniorCitizen == 'y' ? 0.12 : 0.10;
        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, years);
        
        System.out.println("Simple interest: " + simpleInterest);
    }
    
    public static double calculateSimpleInterest(double principal, double rate, int years) {
        return principal * rate * years;
    }
}
