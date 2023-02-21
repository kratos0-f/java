import java.util.Scanner;

public class RealNumbers1Task7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double a = Math.sqrt(x * x + y * y);

        System.out.printf("%.2f \n%.2f \n%.2f \n%.2f\n%.2f", a, (180 / Math.PI) * Math.atan2(y, x), y / a, x / a, y / x);
    }
}
