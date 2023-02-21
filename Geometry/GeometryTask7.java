import java.util.Scanner;

public class GeometryTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        int count = (int) (a / c) * (int) (b / c);
        double s = a * b - count * c * c;

        System.out.print(count);
        System.out.print("\n");
        System.out.printf("%.4f", s);
    }
}
