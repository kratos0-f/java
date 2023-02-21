import java.util.Scanner;

public class GeometryTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double angle = scanner.nextDouble();

        double h = (Math.max(a, b) - Math.min(a, b)) / 2 * Math.tan(angle);
        double s = 0.5 * (a + b) * h;

        System.out.printf("%.1f", s);
    }
}
