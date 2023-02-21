import java.util.Scanner;

public class Boolean2Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        Boolean result1 = (x >= a + 4 && y >= b + 4) || (y >= a + 4 && x >= b + 4);
        Boolean result2 = (x >= a + 4 && y >= c + 4) || (y >= a + 4 && x >= c + 4);
        Boolean result3 = (x >= b + 4 && y >= c + 4) || (y >= b + 4 && x >= c + 4);

        System.out.print((result1 || result2) || result3);
    }
}
