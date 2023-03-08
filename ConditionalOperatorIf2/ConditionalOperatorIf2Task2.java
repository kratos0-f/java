import java.util.Scanner;

public class ConditionalOperatorIf2Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int abs_a = a;
        int abs_b = b;
        int abs_c = c;

        if (a < 0) {
            abs_a = -a;
        }
        if (b < 0) {
            abs_b = -b;
        }
        if (c < 0) {
            abs_c = -c;
        }

        int min = Math.min(abs_a, Math.min(abs_b, abs_c));
        if (min == abs_a) {
            System.out.print(a);
        } else if (min == abs_b) {
            System.out.print(b);
        } else if (min == abs_c) {
            System.out.print(c);
        }
    }
}
