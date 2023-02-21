import java.util.Scanner;

public class GeometryTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        double perimetr = 2 * (a + b);

        System.out.printf("%.3f", perimetr);
        System.out.printf(" ");
        System.out.printf("%.3f", c);

    }
}
