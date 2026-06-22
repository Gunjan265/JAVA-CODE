import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       FIBONACCI SERIES");
        System.out.println("================================");

        System.out.print("Enter number of terms: ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n > 0) {
                printFibonacci(n);
            } else {
                System.out.println("Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        sc.close();
    }
}