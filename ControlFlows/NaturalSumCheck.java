import java.util.Scanner;

public class NaturalSumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            if (sum == formulaSum) {
                System.out.println("Both results are equal");
            } else {
                System.out.println("Results do not match");
            }
        }
    }
}
