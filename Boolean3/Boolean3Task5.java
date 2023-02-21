import java.util.Scanner;

public class Boolean3Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean result1 = a == -b;
        boolean result2 = a == -c;
        boolean result3 = a == -d;
        boolean result4 = b == -c;
        boolean result5 = b == -d;
        boolean result6 = c == -d;

        System.out.print(((((result1 || result2) || result3) || result4) || result5) || result6);
    }
}
