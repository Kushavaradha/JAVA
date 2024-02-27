import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the denomination priority (e.g., 2000 500 200 100):");
        String[] denominationsStr = scanner.nextLine().split(" ");

        int[] denominations = new int[denominationsStr.length];
        for (int i = 0; i < denominationsStr.length; i++) {
            denominations[i] = Integer.parseInt(denominationsStr[i]);
        }

        int totalAmount = 0;
        for (int denomination : denominations) {
            System.out.print("Enter the total number of " + denomination + " notes: ");
            int numberOfNotes = scanner.nextInt();
            totalAmount += denomination * numberOfNotes;
        }

        System.out.println("Total amount available in the ATM machine: " + totalAmount);
        scanner.close();
    }
}
