import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double value;

        while (true) {
            value = scanner.nextDouble();
            if (value == 0.0) {
                break;
            }
            total += value;
        }

        System.out.println("Total sum is: " + total);
    }
}
