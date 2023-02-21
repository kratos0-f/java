import java.util.Scanner;

public class BooleanTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print((a % 2 == 1) & (b % 2 == 1));
    }
}
