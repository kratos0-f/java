import java.util.Scanner;

public class Boolean2Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = a % 10;
        int a2 = a / 10;

        boolean res = (a1) % 2 == 0;
        System.out.print(res);
        System.out.print("\n");
        System.out.print(!res);
    }
}
