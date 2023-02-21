import java.util.Scanner;

public class IntegerTask3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print((2 * a + 2 * b) + "\n" + a * b + "\n" + (a * a + b * b));
    }
}
