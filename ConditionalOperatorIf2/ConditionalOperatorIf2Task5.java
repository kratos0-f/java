import java.util.Scanner;

public class ConditionalOperatorIf2Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if ((a > b && a > c) || (a < b && a < c)) {
            System.out.println("1");
            if (a > b) {
                System.out.print("БОЛЬШЕ");
            } else {
                System.out.print("МЕНЬШЕ");
            }
        } else if ((b > c && b > a) || (b < c && b < a)) {
            System.out.println("2");
            if (b > c) {
                System.out.print("БОЛЬШЕ");
            } else {
                System.out.print("МЕНЬШЕ");
            }
        } else if ((c > a && c > b) || (c < b && c < a)) {
            System.out.println("3");
            if (c > a) {
                System.out.print("БОЛЬШЕ");
            } else {
                System.out.print("МЕНЬШЕ");
            }
        } else {
            System.out.println("4");
            if (d > a) {
                System.out.print("БОЛЬШЕ");
            } else {
                System.out.print("МЕНЬШЕ");
            }
        }
    }
}
