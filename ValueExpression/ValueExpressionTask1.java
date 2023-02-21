import java.util.Scanner;

public class ValueExpressionTask1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        System.out.printf("%.3f", 7 * x * x - 3 * x + 6);
    }
}
