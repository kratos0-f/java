import java.util.Scanner;

public class ValueExpressionTask5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.printf("%.4f", (2 / (x * x + 25) + y) / (Math.sqrt(y) + (x + y) / 2));
    }
}
