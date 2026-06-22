import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("        PRIME CHECKER");
        System.out.println("================================");

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (isPrime(num)) {
                System.out.println(num + " is a PRIME number.");
            } else {
                System.out.println(num + " is NOT a PRIME number.");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        sc.close();
    }
}