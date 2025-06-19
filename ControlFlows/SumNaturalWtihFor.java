import java.util.Scanner;

public class SumNaturalWithFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1) {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println("Both results are equal");
            } else {
                System.out.println("Results do not match");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
