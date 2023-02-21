import java.util.Scanner;

public class Boolean2Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = a % 10;
        int a2 = a / 10 % 10;
        int a3 = a / 100 % 10;
        int a4 = a / 1000;

        System.out.print((a4 + a3) > (a1 + a2));
        System.out.print(" ");
        System.out.print((a1 + a2 + a3 + a4) % 3 == 0);
        System.out.print(" ");
        System.out.print(a1 * a2 * a3 * a3 % 4 == 0);
        System.out.print(" ");
        System.out.print((a1 * a2 * a3 * a4) * 2 > a);
    }
}
