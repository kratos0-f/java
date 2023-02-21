import java.util.Scanner;

public class Numbers1Task5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        System.out.print(a % 10000 / 1000);
    }
}
