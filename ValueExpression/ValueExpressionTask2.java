import java.util.Scanner;

public class ValueExpressionTask2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        System.out.printf("%.2f", (x * x + 10) / Math.sqrt(x * x + 1));
    }
}
