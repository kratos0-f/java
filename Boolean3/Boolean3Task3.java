import java.util.Scanner;

public class Boolean3Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        boolean result1 = (a > 99) && (a < 1000);
        boolean result2 = a % 5 == 0;

        System.out.print(result1 && result2);
    }
}
