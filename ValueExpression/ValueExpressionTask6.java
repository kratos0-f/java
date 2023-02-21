import java.util.Scanner;

public class ValueExpressionTask6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.printf("%.2f", (x + (2 + y) / (x * x)) / (y + 1 / (Math.sqrt(x * x + 10))));
    }
}
