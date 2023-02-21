import java.util.Scanner;

public class Boolean3Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print(a != b);
        System.out.print("\n");
        System.out.print((a > 0 && b > 0));

    }
}
