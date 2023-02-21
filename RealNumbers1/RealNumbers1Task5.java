import java.util.Scanner;

public class RealNumbers1Task5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.printf("%.2f %.2f", (Math.abs(a) + Math.abs(b)) / 2, Math.sqrt(Math.abs(a) * Math.abs(b)));
    }
}
