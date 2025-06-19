import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Enter a natural number (1 or greater)");
        }
    }
}
