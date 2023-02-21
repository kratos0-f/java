import java.util.Scanner;

public class RealNumbers1Task4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.printf("%.3f \n%.3f \n%.3f \n%.3f", a + b, a - b, a * b, Math.pow(a, b));
    }
}
