import java.util.Scanner;

public class RealNumbers1Task6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d \n%d \n%.2f \n%.4f", a / b, a % b, (double) a / (double) b, ((double) a / (double) b) - (a / b));
    }
}
