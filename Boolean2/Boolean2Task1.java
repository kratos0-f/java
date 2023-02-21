import java.util.Scanner;

public class Boolean2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = a % 10;
        int a2 = a / 10;

        System.out.print((a1 + a2) % 3 == 0);
        System.out.print("\n");
        System.out.print(a % (a1 + a2) == 0);
    }
}
