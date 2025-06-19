import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1) {
            int sum = n * (n + 1) / 2;
            System.out.println("The number " + n + " is a natural number.");
            System.out.println("The sum of first " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
