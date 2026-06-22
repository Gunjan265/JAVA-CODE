import java.util.Scanner;

public class FactorialCalculator {

    public static long factorial(int num) {
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      FACTORIAL CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num >= 0) {
                System.out.println("Factorial of " + num + " = " + factorial(num));
            } else {
                System.out.println("Factorial is not defined for negative numbers.");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        sc.close();
    }
}