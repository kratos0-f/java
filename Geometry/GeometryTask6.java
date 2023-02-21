import java.util.Scanner;

public class GeometryTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r1 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double s = Math.PI * r1 * r1 - Math.PI * r2 * r2;

        System.out.printf("%.3f", s);
    }
}
