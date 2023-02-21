import java.util.Scanner;

public class IntegerTask7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        System.out.print(n + (32 - n % 32));
    }
}
