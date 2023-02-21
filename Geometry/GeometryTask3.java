import java.util.Scanner;

public class GeometryTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double angle = (a * Math.PI)/180;

        System.out.printf("%.4f", angle);
    }
}
