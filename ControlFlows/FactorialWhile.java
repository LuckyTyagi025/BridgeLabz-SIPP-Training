import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input");
        } else {
            int factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }
}
