import java.util.Scanner;

public class Boolean2Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = a % 10;
        int a2 = a / 10 % 10;
        int a3 = a / 100;

        System.out.print((a1 + a2 + a3) > 9);
        System.out.print(" ");
        System.out.print(a1 * a2 * a3 > 99);
        System.out.print(" ");
        System.out.print(a1 * a2 * a3 > a);
        System.out.print(" ");
        System.out.print((a1 + a2 + a3) % 5 == 0);
    }
}
