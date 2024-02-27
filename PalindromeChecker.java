import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker Menu:");
        System.out.println("1. Check if a string is a palindrome");
        System.out.println("2. Check if a number is a palindrome");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                scanner.nextLine(); // Consume newline
                String str = scanner.nextLine();
                if (isPalindrome(str))
                    System.out.println("The string \"" + str + "\" is a palindrome.");
                else
                    System.out.println("The string \"" + str + "\" is not a palindrome.");
                break;
            case 2:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                if (isPalindrome(num))
                    System.out.println("The number " + num + " is a palindrome.");
                else
                    System.out.println("The number " + num + " is not a palindrome.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    private static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
