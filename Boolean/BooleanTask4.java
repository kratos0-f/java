import java.util.Scanner;

public class BooleanTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.print((Math.max(a, c) >= b) & (Math.min(a, c) <= b));
    }
}
