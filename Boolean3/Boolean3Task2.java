import java.util.Scanner;

public class Boolean3Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print((Math.abs(a) % 2 == 1) || (Math.abs(b) % 2 == 1));
        System.out.print("\n");
        System.out.print(Math.max(a, b) > 0 && Math.min(a, b) <= 0);

    }
}
