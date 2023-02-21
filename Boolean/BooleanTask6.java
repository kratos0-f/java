import java.util.Scanner;

public class BooleanTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.print((Math.max(a, b) == Math.max(a, c) & Math.max(a, b) == Math.max(b, c)) | Math.min(a, b) == Math.min(a, c) & Math.min(a, b) == Math.min(b, c));
    }
}
