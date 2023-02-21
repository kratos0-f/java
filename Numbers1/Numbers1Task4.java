import java.util.Scanner;

public class Numbers1Task4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        System.out.print(a % 1000 / 100);
    }
}
