import java.util.Scanner;

public class RealNumbers1Task2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double mass = scanner.nextDouble();
        double volume = scanner.nextDouble();

        System.out.printf("%.1f", mass / volume);
    }
}
