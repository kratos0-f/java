import java.util.Scanner;

public class RealNumbers1Task1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double density = scanner.nextDouble();
        double residents = scanner.nextDouble();

        System.out.printf("%.3f", density / residents);
    }
}
