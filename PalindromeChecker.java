import java.util.Scanner;

public class PalindromeChecker {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        String original = str.toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      PALINDROME CHECKER");
        System.out.println("================================");

        System.out.print("Enter a word or number: ");
        String input = sc.nextLine().trim();

        // Input validation
        if (input.isEmpty()) {
            System.out.println("Error: Input cannot be empty!");
        } else {
            if (isPalindrome(input)) {
                System.out.println("\"" + input + "\" is a PALINDROME.");
            } else {
                System.out.println("\"" + input + "\" is NOT a PALINDROME.");
            }
        }

        sc.close();
    }
}