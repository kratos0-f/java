import java.util.Scanner;

public class GeometryTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        double perimetr = a + b + c;

        System.out.printf("%.2f", c);
        System.out.printf("\n");
        System.out.printf("%.2f", perimetr);
    }
}
