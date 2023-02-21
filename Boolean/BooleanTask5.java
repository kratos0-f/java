import java.util.Scanner;

public class BooleanTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.print((a % 2 == 0) & (a > 9 & a < 100));
    }
}
