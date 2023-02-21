import java.util.Scanner;

public class ValueExpressionTask7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        double g = scanner.nextDouble();
        double h = scanner.nextDouble();

        System.out.printf("%.4f", Math.sqrt(Math.pow(Math.abs(e - 3 / f), 3) + g) + Math.sqrt(Math.pow(g - h, 2) - 3 * Math.sin(e)) + (e + f / 2) / 3);
    }
}
