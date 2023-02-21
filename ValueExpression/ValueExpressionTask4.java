import java.util.Scanner;

public class ValueExpressionTask4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.printf("%.3f", x * x * x - 2.5 * x * y + 1.78 * x * x - 2.5 * y + 1);
    }
}
