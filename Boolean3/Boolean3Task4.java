import java.util.Scanner;

public class Boolean3Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result1 = a % 2 == 0;
        boolean result2 = b % 2 == 0;
        boolean result3 = c % 2 == 0;

        System.out.print((result1 ? 1 : 0) + (result2 ? 1 : 0) + (result3 ? 1 : 0) >= 2);
    }
}
