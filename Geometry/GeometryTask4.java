import java.util.Scanner;

public class GeometryTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double s = scanner.nextDouble();

        double r = Math.sqrt(s / Math.PI);
        double d = r * 2;
        double l = Math.PI * d;

        System.out.printf("%.2f\n%.2f", d, l);
    }
}
