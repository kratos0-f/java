import java.util.Scanner;

public class ValueExpressionTask3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        System.out.printf("%.2f", Math.sqrt((2 * x + Math.sin(Math.abs(3 * x)))/3.56));
    }
}
